package com.kodilla.four.one;

import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;

public class PersonProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person item) throws Exception {
        String dateOfBirthAsString = item.getDateOfBirth();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthAsString);
        int age = LocalDate.now().getYear() - dateOfBirth.getYear();
        return new Person(item.getId(), item.getName(), item.getSurname(), age);
    }
}
