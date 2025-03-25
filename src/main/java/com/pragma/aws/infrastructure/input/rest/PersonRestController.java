package com.pragma.aws.infrastructure.input.rest;

import com.pragma.aws.application.dto.PersonDto;
import com.pragma.aws.application.handler.IPersonHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/people/")
public class PersonRestController {

    private final IPersonHandler personHandler;

    @PostMapping("create")
    public ResponseEntity<PersonDto> createPerson (@RequestBody PersonDto personDto){
        PersonDto createdPerson = personHandler.createPerson(personDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPerson);
    }

    @GetMapping("find/{id}")
    public ResponseEntity<PersonDto> findPersonById (@PathVariable Long id){
        PersonDto person = personHandler.findPersonById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(person);
    }

}
