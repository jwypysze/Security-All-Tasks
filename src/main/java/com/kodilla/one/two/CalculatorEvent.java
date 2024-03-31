package com.kodilla.one.two;

import org.springframework.context.ApplicationEvent;

public class CalculatorEvent extends ApplicationEvent {

    private Long number1;
    private Long number2;

    private Long result;

    public CalculatorEvent(Object source, Long number1, Long number2, Long result) {
        super(source);
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    public Long getNumber1() {
        return number1;
    }

    public Long getNumber2() {
        return number2;
    }

    public Long getResult() {
        return result;
    }
}
