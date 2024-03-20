package com.hegaro.service;

import com.hegaro.model.Person;
import com.hegaro.repository.IPersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {
    private final IPersonRepository personRepository;

    public PersonServiceImpl(IPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void register(Person person) {
        personRepository.register(person);
    }
}