package com.kodilla.one.two;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorListener implements ApplicationListener<CalculatorEvent> {

    private final Logger logger = LoggerFactory.getLogger(CalculatorListener.class);

    @Override
    public void onApplicationEvent(CalculatorEvent event) {
        logger.info("The first number: " + event.getNumber1());
        logger.info("The second number: " + event.getNumber2());
        logger.info("The result is: " + event.getResult());
    }
}
