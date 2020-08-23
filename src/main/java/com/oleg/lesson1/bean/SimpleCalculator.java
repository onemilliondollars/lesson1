package com.oleg.lesson1.bean;

import java.util.Objects;

public class SimpleCalculator {
    private int firstNumber;
    private int secondNumber;
    private float divFirstNumber;
    private float divSecondNumber;

    public SimpleCalculator() {
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

    public float getDivFirstNumber() {
        return divFirstNumber;
    }

    public void setDivFirstNumber(float divFirstNumber) {
        this.divFirstNumber = divFirstNumber;
    }

    public float getDivSecondNumber() {
        return divSecondNumber;
    }

    public void setDivSecondNumber(float divSecondNumber) {
        this.divSecondNumber = divSecondNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleCalculator that = (SimpleCalculator) o;
        return firstNumber == that.firstNumber &&
                secondNumber == that.secondNumber &&
                Float.compare(that.divFirstNumber, divFirstNumber) == 0 &&
                Float.compare(that.divSecondNumber, divSecondNumber) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondNumber, divFirstNumber, divSecondNumber);
    }

    @Override
    public String toString() {
        return "SimpleCalculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", divFirstNumber=" + divFirstNumber +
                ", divSecondNumber=" + divSecondNumber +
                '}';
    }
}
