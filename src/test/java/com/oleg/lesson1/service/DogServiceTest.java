package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Dog;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class DogServiceTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void voice() {
        Dog dog = new Dog();
        DogService dogService = new DogService(dog);
        dogService.voice();
        String expected = "gav gav";
        assertEquals(expected, systemOutRule.getLog());
        System.out.println();
    }

    @Test
    public void eat() {
        Dog dog = new Dog();
        DogService dogService = new DogService(dog);
        dogService.eat();
        String expected = "Njam njam";
        assertEquals(expected, systemOutRule.getLog());
        System.out.println();
    }

    @Test
    public void sleep() {
        Dog dog = new Dog();
        DogService dogService = new DogService(dog);
        dogService.sleep();
        String expected = "Zzzzz";
        assertEquals(expected, systemOutRule.getLog());
        System.out.println();
    }
}