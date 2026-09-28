package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        String season;
         return season = switch (monthNumber){
                case 1,2,12 -> "зима";
                case 3,4,5 -> "весна";
                case 6,7,8 -> "лето";
                case 9,10,11 -> "осень";
                default -> throw new IllegalArgumentException(String.
                        format("monthNumber %s is invalid, month number should be between 1..12",monthNumber));
        };
    }
}