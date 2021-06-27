package com.epam.unit06.task01;

public class Counter {
    private int value;
    private int min;
    private int max;

    public Counter() {
        value = 0;
        min = 0;
        max = 100;
    }

    public Counter(int x) {
        value = x;
        min = 0;
        max = 100;
    }

    public Counter(int x, int a, int b) {
        value = x;
        min = a;
        max = b;
    }

    public int getMinBound() {
        return min;
    }

    public int getMaxBound() {
        return max;
    }

    public int getValue() {
        return value;
    }

    public int increaseCounter() {
        int increase = value + 1;
        if (increase <= max) {
            value = increase;
        }
        return value;
    }

    public int decreaseCounter() {
        int decrease = value - 1;
        if (decrease >= min) {
            value = decrease;
        }
        return value;
    }


}