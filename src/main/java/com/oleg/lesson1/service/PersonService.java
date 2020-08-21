package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Person;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class PersonService {
    private Person person;
    private Logger logger = LoggerFactory.getLogger(PersonService.class);

    public PersonService(Person person) {
        this.person = person;
    }

    public boolean ifAdult() {
        logger.info("Checking if person is adult");
        return person.getAge()>=18;
    }

}
