package com.kodilla.one.two;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController implements ApplicationEventPublisherAware {

    private final Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    private ApplicationEventPublisher publisher;

    @PostMapping(path = "/add")
    public Long add(@RequestBody NumbersDto numbersDto) {
        Long result = numbersDto.getNumber1() + numbersDto.getNumber2();
        logger.info("Addition");
        publisher.publishEvent(new CalculatorEvent(this, numbersDto.getNumber1(), numbersDto.getNumber2(), result));
        return result;
    }

    @PostMapping(path = "/minus")
    public Long minus(@RequestBody NumbersDto numbersDto) {
        Long result = numbersDto.getNumber1() - numbersDto.getNumber2();
        logger.info("Subtraction");
        publisher.publishEvent(new CalculatorEvent(this, numbersDto.getNumber1(), numbersDto.getNumber2(), result));
        return result;
    }

    @PostMapping(path = "/times")
    public Long times(@RequestBody NumbersDto numbersDto) {
        Long result = numbersDto.getNumber1() * numbersDto.getNumber2();
        logger.info("Multiplication");
        publisher.publishEvent(new CalculatorEvent(this, numbersDto.getNumber1(), numbersDto.getNumber2(), result));
        return result;
    }

    @PostMapping(path = "/divide")
    public Long divide(@RequestBody NumbersDto numbersDto) {
        Long result = numbersDto.getNumber1() / numbersDto.getNumber2();
        logger.info("Division");
        publisher.publishEvent(new CalculatorEvent(this, numbersDto.getNumber1(), numbersDto.getNumber2(), result));
        return result;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
