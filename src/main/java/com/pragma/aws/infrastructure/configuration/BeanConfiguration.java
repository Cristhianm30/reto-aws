package com.pragma.aws.infrastructure.configuration;

import com.pragma.aws.domain.ports.in.IPersonServicePort;
import com.pragma.aws.domain.ports.out.IPersonPersistencePort;
import com.pragma.aws.domain.usecase.PersonUseCase;
import com.pragma.aws.domain.validations.PersonValidations;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {


    @Bean
    public IPersonServicePort iPersonServicePort(PersonValidations personValidations,IPersonPersistencePort personPersistencePort){
        return new PersonUseCase(personValidations,personPersistencePort);
    }

    @Bean
    public PersonValidations personValidations(){
        return new PersonValidations();
    }


}
