package com.pragma.aws.application.handler;

import com.pragma.aws.application.dto.PersonDto;

public interface IPersonHandler {

    PersonDto createPerson (PersonDto dto);

    PersonDto findPersonById (Long id);

}
