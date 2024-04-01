package com.kodilla.two.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaAgentController {

    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public void createUserAndCallMethod() {
        User user = new User();
        user.doSomething();
    }

}