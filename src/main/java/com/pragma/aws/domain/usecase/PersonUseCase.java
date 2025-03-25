package com.pragma.aws.domain.usecase;

import com.pragma.aws.domain.model.Person;
import com.pragma.aws.domain.ports.in.IPersonServicePort;
import com.pragma.aws.domain.ports.out.IPersonPersistencePort;
import com.pragma.aws.domain.validations.PersonValidations;


public class PersonUseCase implements IPersonServicePort {

    private final PersonValidations personValidations;
    private final IPersonPersistencePort persistencePort;


    public PersonUseCase(PersonValidations personValidations, IPersonPersistencePort persistencePort) {
        this.personValidations = personValidations;
        this.persistencePort = persistencePort;
    }


    @Override
    public Person createPerson(Person person) {

        personValidations.validateCreatePerson(person);

        return persistencePort.save(person);

    }

    @Override
    public Person findPersonById(Long id) {

        return persistencePort.findById(id);

    }


}
