package com.pragma.aws.infrastructure.output.jpa.mapper;

import com.pragma.aws.domain.model.Person;
import com.pragma.aws.infrastructure.output.jpa.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPersonEntityMapper {

    Person toModel (PersonEntity entity);

    PersonEntity toEntity (Person model);

}
