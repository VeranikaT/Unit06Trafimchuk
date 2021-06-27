package com.epam.unit06.task02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Time time = new Time(8, 66, 34);
        System.out.printf("The set time is %02d:%02d:%02d.\n", time.getHours(), time.getMinutes(), time.getSeconds());

        time.setHours(336);
        time.setMinutes(35);
        time.setSeconds(5);
        System.out.printf("The new set time is %02d:%02d:%02d.\n", time.getHours(), time.getMinutes(), time.getSeconds());

        time.addHours(25);
        System.out.printf("The current time is %02d:%02d:%02d.\n", time.getHours(), time.getMinutes(), time.getSeconds());

        time.addMinutes(1584);
        System.out.printf("The current time is %02d:%02d:%02d.\n", time.getHours(), time.getMinutes(), time.getSeconds());

        time.addSeconds(90055);
        System.out.printf("The current time is %02d:%02d:%02d.\n", time.getHours(), time.getMinutes(), time.getSeconds());

    }
}