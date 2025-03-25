package com.pragma.aws.application.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonDto {

    private Long identification;
    private String name;
    private String email;

}
