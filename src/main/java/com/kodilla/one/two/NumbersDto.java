package com.kodilla.one.two;

public class NumbersDto {

    private Long number1;
    private Long number2;

    public NumbersDto(Long numner1, Long number2) {
        this.number1 = numner1;
        this.number2 = number2;
    }

    public Long getNumber1() {
        return number1;
    }

    public Long getNumber2() {
        return number2;
    }
}
