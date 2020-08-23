package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.RandomGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class RandomGeneratorService {
    private RandomGenerator randomGenerator;
    Logger logger = LoggerFactory.getLogger(RandomGeneratorService.class);

    public RandomGeneratorService(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public void setRandomNumbers(int a, int b, int c){
        Random random = new Random();
        randomGenerator.setFirstNumber(random.nextInt(a));
        randomGenerator.setSecondNumber(random.nextInt(b));
        randomGenerator.setThirdNumber(random.nextInt(c));
    }

    public int randomNumberSum(){
        return  randomGenerator.getFirstNumber() +
                randomGenerator.getSecondNumber() +
                randomGenerator.getThirdNumber();
    }

    public String showRandomNumbers(){
        logger.info("checking how showing random numbers");
        int firstNumber = randomGenerator.getFirstNumber();
        int secondNumber = randomGenerator.getSecondNumber();
        int thirdNumber = randomGenerator.getThirdNumber();
        System.out.println(firstNumber + " " +secondNumber + " " +thirdNumber);
        return firstNumber + " | "  + secondNumber + " | " +thirdNumber;
    }


}
