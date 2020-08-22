package com.oleg.lesson1.bean;

public class HumanService {
    private Human human;

    public HumanService(Human human) {
        this.human = human;
    }

    public void greet(){
        System.out.print("Name: " +human.name + ", Age: " +human.age);
    }
}
