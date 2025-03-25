package com.pragma.aws.infrastructure.exceptionhandler;

import com.pragma.aws.domain.exception.InvalidEmailException;
import com.pragma.aws.domain.exception.InvalidIdentificationException;
import com.pragma.aws.domain.exception.InvalidNameException;
import com.pragma.aws.infrastructure.exception.PersonNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {

    private static final String MESSAGE = "message";

    @ExceptionHandler(InvalidEmailException.class)
    public ResponseEntity<Map<String, String>> invalidEmailException(
            InvalidEmailException invalidEmailException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.INVALID_EMAIL.getMessage()));
    }

    @ExceptionHandler(InvalidIdentificationException.class)
    public ResponseEntity<Map<String, String>> invalidIdentificationException(
            InvalidIdentificationException invalidIdentificationException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.INVALID_IDENTIFICATION.getMessage()));
    }

    @ExceptionHandler(InvalidNameException.class)
    public ResponseEntity<Map<String, String>> invalidNameException(
            InvalidNameException invalidNameException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.INVALID_NAME.getMessage()));
    }

    @ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity<Map<String, String>> personNotFoundException(
            PersonNotFoundException personNotFoundException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.PERSON_NOT_FOUND.getMessage()));
    }


}
