# --- Etapa de compilación optimizada ---
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app

# Cacheo eficiente de dependencias
COPY pom.xml .
RUN mvn dependency:resolve-plugins dependency:go-offline

COPY src ./src

# Build con perfil de producción
RUN mvn package -DskipTests

# --- Etapa de ejecución segura ---
FROM eclipse-temurin:21.0.6_7-jre

WORKDIR /app
COPY --from=builder --chown=appuser:appuser /app/target/*.jar ./app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]