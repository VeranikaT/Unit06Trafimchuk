package com.epam.unit06.task02;


public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int h, int min, int sec) {
        hours = (h > 23 || h < 0) ? 0 : h;
        minutes = (min > 59 || min < 0) ? 0 : min;
        seconds = (sec > 59 || sec < 0) ? 0 : sec;
    }

    public void setHours(int h) {
        hours = (h > 23 || h < 0) ? 0 : h;
    }

    public void setMinutes(int min) {
        minutes = (min > 59 || min < 0) ? 0 : min;
    }

    public void setSeconds(int sec) {
        seconds = (sec > 59 || sec < 0) ? 0 : sec;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void addSeconds(int sec) {
        if (sec >= 86400) {
            int days = sec / 86400;
            System.out.printf("More than 24 hours has been added. Set time was for " + days + " day(s) with the current time. ");
        }
        seconds += sec;
        minutes += seconds / 60;
        hours += minutes / 60;
        seconds %= 60;
        minutes %= 60;
        hours %= 24;
    }

    public void addMinutes(int min) {
        if (min >= 1440) {
            int days = min / 1440;
            System.out.printf("More than 24 hours has been added. Set time was for " + days + " day(s) with the current time. ");
        }
        minutes += min;
        hours += minutes / 60;
        minutes %= 60;
        hours %= 24;
    }

    public void addHours(int h) {
        if (h >= 24) {
            int days = h / 24;
            System.out.printf("More than 24 hours has been added. Set time was for  " + days + " day(s) with the current time. ");
        }
        hours += h;
        hours %= 24;
    }
}