package com.oleg.lesson1.bean;

import java.util.Objects;

public class RandomGenerator {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public RandomGenerator() {
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomGenerator that = (RandomGenerator) o;
        return firstNumber == that.firstNumber &&
                secondNumber == that.secondNumber &&
                thirdNumber == that.thirdNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondNumber, thirdNumber);
    }

    @Override
    public String toString() {
        return "RandomGenerator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", thirdNumber=" + thirdNumber +
                '}';
    }
}
