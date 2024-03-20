package com.hegaro.repository;

import com.hegaro.model.Person;
import org.springframework.stereotype.Repository;

import static java.lang.System.*;
@Repository
public class PersonRepositoryImpl implements IPersonRepository {
    @Override
    public void register(Person person) {
        out.println("Se registró a: " + person.getName());
    }
}