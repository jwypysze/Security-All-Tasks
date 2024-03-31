package com.kodilla.two.two;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dog")
public class DogController {

    @PostMapping(path = "/add")
    public void createNewDog(@RequestBody Dog dog) {
        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Dog's age: " + dog.getAge());
        System.out.println("Dog's colour: " + dog.getColour());
    }
}
