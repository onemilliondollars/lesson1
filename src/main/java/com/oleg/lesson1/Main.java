package com.oleg.lesson1;

import com.oleg.lesson1.bean.RandomGenerator;
import com.oleg.lesson1.bean.SimpleCalculator;
import com.oleg.lesson1.service.RandomGeneratorService;
import com.oleg.lesson1.service.SimpleCalculatorService;

public class Main {
    public static void main(String[] args) {
        // App
        RandomGenerator randomGenerator = new RandomGenerator();
        RandomGeneratorService randomGeneratorService = new RandomGeneratorService(randomGenerator);
        randomGeneratorService.setRandomNumbers(3,3,3);
        randomGenerator.getFirstNumber();
        randomGenerator.getSecondNumber();
        randomGenerator.getThirdNumber();

        randomGeneratorService.showRandomNumbers();

        System.out.println("------");

        System.out.println(randomGeneratorService.randomNumberSum());
    }
}
