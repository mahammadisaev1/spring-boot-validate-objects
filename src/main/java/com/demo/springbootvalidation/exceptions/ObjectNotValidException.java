package com.demo.springbootvalidation.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
public class ObjectNotValidException extends RuntimeException{

    private final Set<String> errorMessages;
}
