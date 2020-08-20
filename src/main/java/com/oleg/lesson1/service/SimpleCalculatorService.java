package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.SimpleCalculator;

public class SimpleCalculatorService {
    private SimpleCalculator simpleCalculator;

    public SimpleCalculatorService(SimpleCalculator simpleCalculator) {
        this.simpleCalculator = simpleCalculator;
    }

    public int sum(int a, int b){
        simpleCalculator.setFirstNumber(a);
        simpleCalculator.setSecondNumber(b);
        return simpleCalculator.getFirstNumber() + simpleCalculator.getSecondNumber();
    }

    public int sub(int a, int b){
        simpleCalculator.setFirstNumber(a);
        simpleCalculator.setSecondNumber(b);
        return simpleCalculator.getFirstNumber() - simpleCalculator.getSecondNumber();
    }

    public int multi(int a, int b){
        simpleCalculator.setFirstNumber(a);
        simpleCalculator.setSecondNumber(b);
        return simpleCalculator.getFirstNumber() * simpleCalculator.getSecondNumber();
    }

    public float dev(float a, float b) {
        simpleCalculator.setDivFirstNumber(a);
        simpleCalculator.setDivSecondNumber(b);
        return simpleCalculator.getDivFirstNumber() / simpleCalculator.getDivSecondNumber();
    }


}
