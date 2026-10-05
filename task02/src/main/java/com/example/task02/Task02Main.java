package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case (1), (2), (12):
                return "зима";
            case (3), (4), (5):
                return "весна";
            case (6), (7), (8):
                return "лето";
            case (9), (10), (11):
                return "осень";
            default:
                throw new IllegalArgumentException("monthNumber "
                        + monthNumber + " is invalid, month number should be between 1..12");


        }
    }
}