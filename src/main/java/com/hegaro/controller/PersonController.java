package com.hegaro.controller;

import com.hegaro.model.Person;
import com.hegaro.service.IPersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final IPersonService personService;

    public PersonController(IPersonService personService) {
        this.personService = personService;
    }
    @GetMapping
    public void register() {
        Person person = new Person();
        person.setId(1);
        person.setName("Henry");

        personService.register(person);
    }
}