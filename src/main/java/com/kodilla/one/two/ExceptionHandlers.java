package com.kodilla.one.two;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(ArithmeticException.class)
    void handleArithmeticException() {
        System.out.println("You cannot divide by 0!");
    }
}
