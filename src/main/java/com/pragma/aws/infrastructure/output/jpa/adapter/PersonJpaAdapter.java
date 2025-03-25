package com.pragma.aws.infrastructure.output.jpa.adapter;

import com.pragma.aws.domain.model.Person;
import com.pragma.aws.domain.ports.out.IPersonPersistencePort;
import com.pragma.aws.infrastructure.exception.PersonNotFoundException;
import com.pragma.aws.infrastructure.output.jpa.entity.PersonEntity;
import com.pragma.aws.infrastructure.output.jpa.mapper.IPersonEntityMapper;
import com.pragma.aws.infrastructure.output.jpa.repository.IPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonJpaAdapter implements IPersonPersistencePort {

    private final IPersonEntityMapper personEntityMapper;
    private final IPersonRepository personRepository;


    @Override
    public Person save(Person person) {

        PersonEntity entity = personEntityMapper.toEntity(person);
        PersonEntity savedEntity = personRepository.save(entity);

        return personEntityMapper.toModel(savedEntity);
    }

    @Override
    public Person findById(Long id) {

        PersonEntity entity = personRepository.findById(id).orElseThrow(PersonNotFoundException::new);

        return personEntityMapper.toModel(entity);
    }

}
