package com.pragma.aws.infrastructure.output.jpa.repository;


import com.pragma.aws.infrastructure.output.jpa.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPersonRepository extends JpaRepository<PersonEntity, Long> {

   Optional<PersonEntity> findById (Long id);

}
