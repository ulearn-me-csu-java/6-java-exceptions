package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        // Для проверки:
        // System.out.println(getSeason(1));  // Зима
        // System.out.println(getSeason(-5)); // Ошибка MyException!
    }

    static String getSeason(int monthNumber) {
        // проверяем диапазон
        if (monthNumber < 1 || monthNumber > 12) {
            // кидаем наше исключение вместо стандартного
            throw new MyException(
                    "monthNumber " + monthNumber + " is invalid, month number should be between 1..12"
            );
        }

        // возвращаем время года
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