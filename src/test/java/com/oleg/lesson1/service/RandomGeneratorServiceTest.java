package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.RandomGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomGeneratorServiceTest {

    @Test
    public void checkRandomNumbersRange() {
        RandomGenerator randomGenerator = new RandomGenerator();
        RandomGeneratorService randService = new RandomGeneratorService(randomGenerator);
        randService.setRandomNumbers(3,3,3);
        int a = randomGenerator.getFirstNumber();
        int b = randomGenerator.getSecondNumber();
        int c = randomGenerator.getThirdNumber();

        boolean actual = false;
        boolean expected = true;
        int randomRange = a+b+c;
        if (randomRange >= 0 && randomRange <= (9-3)){ actual = true;}
        assertEquals(expected,actual);
    }

    @Test
    public void randomNumberSum() {
        RandomGenerator randomGenerator = new RandomGenerator();
        RandomGeneratorService randomGeneratorService = new RandomGeneratorService(randomGenerator);
        randomGenerator.setFirstNumber(1);
        randomGenerator.setSecondNumber(5);
        randomGenerator.setThirdNumber(7);
        int expected = 13;
        int actual = randomGeneratorService.randomNumberSum();
        assertEquals(expected,actual);
    }

    @Test
    public void showRandomNumbers() {
        RandomGenerator randomGenerator = new RandomGenerator();
        RandomGeneratorService randomGeneratorService = new RandomGeneratorService(randomGenerator);
        randomGenerator.setFirstNumber(1);
        randomGenerator.setSecondNumber(5);
        randomGenerator.setThirdNumber(6);
        String expected = "1 | 5 | 6";
        String actual = randomGeneratorService.showRandomNumbers();
        assertEquals(expected,actual);

    }
}