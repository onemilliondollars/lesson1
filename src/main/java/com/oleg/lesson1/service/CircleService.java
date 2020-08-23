package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Circle;

import static java.lang.Math.PI;

public class CircleService {
    private Circle circle;

    public CircleService(Circle circle) {
        this.circle = circle;
    }

    public double calculateArea(){
        double radius = circle.getRadius();
        return PI * radius * radius;
    }
}
