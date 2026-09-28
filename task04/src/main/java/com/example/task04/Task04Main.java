package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(1));
    }

    static String getSeason(int monthNumber) {
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "зима";
            case 3, 4, 5 -> "весна";
            case 6, 7, 8 -> "лето";
            case 9, 10, 11 -> "осень";
            default -> throw new MyException(
                    String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber)
            );
        };
        return season;
    }
}