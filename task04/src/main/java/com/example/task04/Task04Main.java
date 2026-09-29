package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new MyException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        }
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return "зима";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "лето";
        } else {
            return "осень";
        }
    }
}