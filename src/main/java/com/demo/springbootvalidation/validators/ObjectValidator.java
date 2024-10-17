package com.demo.springbootvalidation.validators;

import com.demo.springbootvalidation.dto.Greeting;
import com.demo.springbootvalidation.exceptions.ObjectNotValidException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ObjectValidator<T> {
    private final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = validatorFactory.getValidator();

    public void validate(T objectToValidate) {
        Set<ConstraintViolation<T>> violations = validator.validate(objectToValidate);
        if(!violations.isEmpty()){
          var errorMessages = violations
                  .stream()
                  .map(ConstraintViolation::getMessage)
                  .collect(Collectors.toSet());
        throw new ObjectNotValidException(errorMessages);
        }

    }

}
