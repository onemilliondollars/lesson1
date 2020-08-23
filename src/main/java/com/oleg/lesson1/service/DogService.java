package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Dog;

public class DogService {
    private Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    public void voice() {
        String voice = "gav gav";
        System.out.print(voice);
    }

    public void eat() {
        String eat = "Njam njam";
        System.out.print(eat);
    }

    public void sleep() {
        String sleep = "Zzzzz";
        System.out.print(sleep);
    }
}
