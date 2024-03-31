package com.kodilla.two.three;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessagingController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(path = "/process")
    public void processMessage(@RequestBody Order order) {
        jmsTemplate.convertAndSend("queue-task", order);
    }
}
