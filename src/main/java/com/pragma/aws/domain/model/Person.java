package com.pragma.aws.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    private Long id;
    private String identification;
    private String name;
    private String email;

}
