package com.demo.springbootvalidation.controllers;

import com.demo.springbootvalidation.dto.Greeting;
import com.demo.springbootvalidation.services.GreetingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/greetings")
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService greetingService;

//    @PostMapping
//    public ResponseEntity<String> postGreeting(@RequestBody @Valid Greeting greeting, BindingResult bindingResult){
//        if (bindingResult.hasErrors()){
//            return ResponseEntity
//                    .badRequest()
//                    .body(bindingResult.getAllErrors()
//                            .stream()
//                            .map(ObjectError::getDefaultMessage)
//                            .collect(Collectors.joining()));
//        }
//        final String greetingMsg = greetingService.saveGreeting(greeting);
//        return ResponseEntity
//                .accepted()
//                .body(greetingMsg);
//    }


    @PostMapping
    public ResponseEntity<String> postGreeting(@RequestBody Greeting greeting){
        final String greetingMsg = greetingService.saveGreeting(greeting);
        return ResponseEntity
                .accepted()
                .body(greetingMsg);
    }

    @GetMapping("/error")
    public ResponseEntity<?> throwException(){
        return ResponseEntity.ok(greetingService.throwException());
    }

//    @ExceptionHandler(IllegalStateException.class)
//    public ResponseEntity<?> handleException(IllegalStateException exception){
//        return ResponseEntity
//                .badRequest()
//                .body(exception.getMessage());
//
//    }

}
