package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleServiceTest {

    @Test
    public void calculateArea() {
        Circle circle = new Circle();
        CircleService circleService = new CircleService(circle);

        circle.setRadius(100);
        double expected = 31415.927;
        double actual = circleService.calculateArea();
        assertEquals(expected,actual,0.01);

    }
}