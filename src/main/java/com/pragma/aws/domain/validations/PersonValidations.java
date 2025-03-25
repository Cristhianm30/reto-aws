package com.pragma.aws.domain.validations;

import com.pragma.aws.domain.exception.InvalidEmailException;
import com.pragma.aws.domain.exception.InvalidIdentificationException;
import com.pragma.aws.domain.exception.InvalidNameException;
import com.pragma.aws.domain.model.Person;

public class PersonValidations {


    public void validateCreatePerson(Person person){
        validateEmail(person);
        validateIdentification(person);
        validateName(person);
    }


    private void validateEmail (Person person){

        if (person.getEmail() == null || !person.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")){
            throw new InvalidEmailException();
        }

    }

    private void validateIdentification (Person person){

        if (person.getIdentification()== null || !person.getIdentification().matches("^\\d{10}$")){
            throw new InvalidIdentificationException();
        }

    }

    private void  validateName (Person person){

        if (person.getName() == null || person.getName().isBlank()){
            throw new InvalidNameException();
        }

    }


}
