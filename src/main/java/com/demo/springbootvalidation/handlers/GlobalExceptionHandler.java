package com.demo.springbootvalidation.handlers;

import com.demo.springbootvalidation.exceptions.ObjectNotValidException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.lang.model.UnknownEntityException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<?> handleException(IllegalStateException exception){
        return ResponseEntity
                .badRequest()
                .body(exception.getMessage());

    }

    @ExceptionHandler(ObjectNotValidException.class)
    public ResponseEntity<?> handleException(ObjectNotValidException exception){
        return ResponseEntity
                .badRequest()
                .body(exception.getMessage());

    }


}
