package com.demo.springbootvalidation.dto;

import jakarta.validation.constraints.NotNull;

public class ExampleDto {

    @NotNull
    private String a;
    @NotNull
    private String b;
    @NotNull
    private String c;
}
