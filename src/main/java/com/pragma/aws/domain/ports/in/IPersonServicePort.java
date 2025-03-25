package com.pragma.aws.domain.ports.in;

import com.pragma.aws.domain.model.Person;

public interface IPersonServicePort {

    Person createPerson (Person person);

    Person findPersonById (Long id);
}
