package com.pragma.aws.domain.ports.out;

import com.pragma.aws.domain.model.Person;

public interface IPersonPersistencePort {

    Person save (Person person);

    Person findById (Long id);

}
