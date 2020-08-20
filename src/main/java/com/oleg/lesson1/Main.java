package com.oleg.lesson1;

import com.oleg.lesson1.bean.SimpleCalculator;
import com.oleg.lesson1.service.SimpleCalculatorService;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        SimpleCalculatorService simpleCalculatorService = new SimpleCalculatorService(simpleCalculator);
        System.out.println(simpleCalculatorService.dev(10, 3));
    }
//    public static int sum(int a, int b){
//        return a + b;
//    }
//
//    public static int sub(int a, int b){
//        return a - b;
//    }
//
//    public static int multi(int a, int b){
//        return a * b;
//    }
//
//    public static float dev(float a, float b){
//        return a / b;
//    }
}
