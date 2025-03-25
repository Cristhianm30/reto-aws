package com.pragma.aws.infrastructure.exceptionhandler;

public enum ExceptionResponse {

    INVALID_EMAIL("ERROR: El email de la peticion es nulo o no tiene la estuctura de un email."),
    INVALID_IDENTIFICATION("ERROR: La identificacion es nula o no tiene los 10 digitos."),
    INVALID_NAME("ERROR: el nombre no puede ser nulo."),
    PERSON_NOT_FOUND("ERROR: La persona no existe en la base de datos");



    private final String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
