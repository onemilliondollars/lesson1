package com.oleg.lesson1;

import com.oleg.lesson1.bean.Person;
import com.oleg.lesson1.service.PersonService;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);

        PersonService personService = new PersonService(person);
        System.out.println(personService.ifAdult());
    }
}
