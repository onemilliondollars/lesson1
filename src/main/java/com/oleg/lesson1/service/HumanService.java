package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Human;

public class HumanService {
    private Human human;

    public HumanService(Human human) {
        this.human = human;
    }

    public void greet(){
        System.out.print("Name: " +human.getName() + ", Age: " +human.getAge());
    }
}
