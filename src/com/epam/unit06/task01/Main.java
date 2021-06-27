package com.epam.unit06.task01;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();

        System.out.printf("Counter initialized. The default value: %d.\n", counter.getValue());
        for (int i = 0; i < 200; i++)
            counter.increaseCounter();
        System.out.printf("Value should be increased 200 times by counter, but max bound is 100. The result: %d.\n", counter.getValue());
        for (int i = 50; i > 0; i--)
            counter.decreaseCounter();
        System.out.printf("Value was decreased by counter 50 times from start value - 100. The result: %d.\n", counter.getValue());

        Counter counteronevalue = new Counter(24);

        System.out.printf("Counter initialized with defined value. The value: %d.\n", counteronevalue.getValue());
        for (int i = 0; i < 50; i++)
            counteronevalue.increaseCounter();
        System.out.printf("Defined value was increased 50 times. The result: %d.\n", counteronevalue.getValue());
        int incr = counteronevalue.getValue();
        for (int i = 10; i > 0; i--)
            counteronevalue.decreaseCounter();
        System.out.printf("Value was decreased by counter 10 times from start value - " + incr + ". The result: %d.\n", counteronevalue.getValue());

        Counter counterwithbounds = new Counter(50, 0, 250);

        System.out.printf("Counter initialized with defined value and bounds. The value: %d. Min bound: %d. Max bound: %d.\n", counterwithbounds.getValue(), counterwithbounds.getMinBound(), counterwithbounds.getMaxBound());
        for (int i = 0; i < 300; i++)
            counterwithbounds.increaseCounter();
        int max = counterwithbounds.getMaxBound();
        System.out.printf("Defined value was increased 300 times, but the max bound is " + max + ". The result: %d.\n", counterwithbounds.getValue());
        int prev = counterwithbounds.getValue();
        for (int i = 10; i > 0; i--)
            counterwithbounds.decreaseCounter();
        System.out.printf("Value was decreased by counter 10 times from start value - " + prev + ". The result: %d.\n", counterwithbounds.getValue());

    }
}