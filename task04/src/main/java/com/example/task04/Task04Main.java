package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        return switch (monthNumber) {
            case 12, 1, 2 -> "зима";
            case 3, 4, 5 -> "весна";
            case 6, 7, 8 -> "лето";
            case 9, 10, 11 -> "осень";

            default ->
                    throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        };

    }

}