package com.pragma.aws.application.handler;

import com.pragma.aws.application.dto.PersonDto;
import com.pragma.aws.application.mapper.IPersonMapper;
import com.pragma.aws.domain.model.Person;
import com.pragma.aws.domain.ports.in.IPersonServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonHandlerImpl implements IPersonHandler{

    private final IPersonServicePort personServicePort;
    private final IPersonMapper personMapper;



    @Override
    public PersonDto createPerson(PersonDto dto) {

        Person model = personMapper.toModel(dto);

        Person createdPerson = personServicePort.createPerson(model);

        return personMapper.toDto(createdPerson);
    }

    @Override
    public PersonDto findPersonById(Long id) {

        Person person = personServicePort.findPersonById(id);

        return personMapper.toDto(person);
    }


}
