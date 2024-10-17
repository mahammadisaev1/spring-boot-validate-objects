package com.demo.springbootvalidation.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeting {

    @NotEmpty(message = "the message should not be empty or null")
    private String message;

    @NotEmpty(message = "the from should not be empty or null")
    private String from;

    @NotEmpty(message = "the to should not be empty or null")
    private String to;
}
