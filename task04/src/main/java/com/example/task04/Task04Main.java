package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case 12, 1, 2:
                return "зима";
            case 3, 4, 5:
                return "весна";
            case 6, 7, 8:
                return "лето";
            case 9, 10, 11:
                return "осень";
            default:
                throw new MyException(
                        String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        }
    }

}