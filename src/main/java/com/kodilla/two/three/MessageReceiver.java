package com.kodilla.two.three;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "queue-task")
    public void receive(Order order) {
        System.out.println("Received message:");
        System.out.println("Product name: " + order.getProductName());
        System.out.println("Amount: " + order.getAmount());
        System.out.println("Price: " + order.getPrice());
    }
}
