package com.demo.springbootvalidation.services;

import com.demo.springbootvalidation.dto.ExampleDto;
import com.demo.springbootvalidation.dto.Greeting;
import com.demo.springbootvalidation.validators.ObjectValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {

    private final ObjectValidator<Greeting> greetingValidator;
    private final ObjectValidator<ExampleDto> exampleDtoValidator;


    public String saveGreeting(Greeting greeting){
//        var violations = greetingValidator.validate(greeting);
//        if(!violations.isEmpty()){
//            return String.join("\n", violations);
//        }

        greetingValidator.validate(greeting);
        final String greetingMsg =
                "Greeting message <<"+
                        greeting.getMessage()
                + ">> from: " +
                        greeting.getFrom().toUpperCase()
                + " to: " +
                        greeting.getTo().toUpperCase();
        return greetingMsg;
    }


    public String throwException() {
        throw new IllegalStateException("Some exception happened");
    }
}
