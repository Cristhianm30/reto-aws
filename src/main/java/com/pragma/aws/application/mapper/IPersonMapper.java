package com.pragma.aws.application.mapper;

import com.pragma.aws.application.dto.PersonDto;
import com.pragma.aws.domain.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPersonMapper {

    Person toModel (PersonDto dto);

    PersonDto toDto (Person model);


}
