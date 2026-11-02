package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(1));   // зима
        System.out.println(getSeason(4));   // весна
        System.out.println(getSeason(7));   // лето
        System.out.println(getSeason(10));  // осень
        System.out.println(getSeason(-5));  // кинет исключение
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                return "зима";
            case 3:
            case 4:
            case 5:
                return "весна";
            case 6:
            case 7:
            case 8:
                return "лето";
            case 9:
            case 10:
            case 11:
                return "осень";
            default:
                throw new IllegalArgumentException(
                        "monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }
    }
}