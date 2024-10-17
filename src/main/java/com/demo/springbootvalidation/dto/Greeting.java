package com.demo.springbootvalidation.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeting {

    @NotNull(message = "the message should not be null")
    @NotEmpty(message = "the message should not be empty")
    private String message;

    @NotNull(message = "the from should not be null")
    @NotEmpty(message = "the from should not be empty")
    private String from;

    @NotNull(message = "the to should not be null")
    @NotEmpty(message = "the to should not be empty")
    private String to;
}
