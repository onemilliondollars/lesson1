package com.oleg.lesson1.bean;

import java.util.Objects;

public class Encoder {
    private char symbol;
    private int code;

    public Encoder() {
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encoder encoder = (Encoder) o;
        return symbol == encoder.symbol &&
                Objects.equals(code, encoder.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, code);
    }

    @Override
    public String toString() {
        return "Encoder{" +
                "symbol=" + symbol +
                ", code='" + code + '\'' +
                '}';
    }
}
