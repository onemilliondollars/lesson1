package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonServiceTest {

    @Test
    public void ifAdultTest(){
        Person person = new Person();
        person.setAge(18);

        PersonService personService = new PersonService(person);

        boolean expected = true;
        boolean actual = personService.ifAdult();
        assertEquals(expected, actual);

    }


}