package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.SimpleCalculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorServiceTest {

    @Test
    public void sum() {
        SimpleCalculator newCalc = new SimpleCalculator();
        SimpleCalculatorService calculator = new SimpleCalculatorService(newCalc);
        int expected = 11;
        int actual = calculator.sum(7,4);
        assertEquals(expected,actual);
    }

    @Test
    public void sub() {
        SimpleCalculator newCalc = new SimpleCalculator();
        SimpleCalculatorService calculator = new SimpleCalculatorService(newCalc);
        int expected = 155;
        int actual = calculator.sub(175,20);
        assertEquals(expected,actual);
    }

    @Test
    public void multi() {
        SimpleCalculator newCalc = new SimpleCalculator();
        SimpleCalculatorService calculator = new SimpleCalculatorService(newCalc);
        int expected = 18;
        int actual = calculator.multi(3,6);
        assertEquals(expected,actual);
    }

    @Test
    public void dev() {
        SimpleCalculator newCalc = new SimpleCalculator();
        SimpleCalculatorService calculator = new SimpleCalculatorService(newCalc);
        float expected = 3.3333333F;
        float actual = calculator.dev(10F,3F);
        assertEquals(expected,actual,0.0001);
    }
}