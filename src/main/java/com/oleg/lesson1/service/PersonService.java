package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Person;

public class PersonService {
    private Person person;

    public PersonService(Person person) {
        this.person = person;
    }

    public boolean ifAdult() {
        return person.getAge()>=18;
    }

}
