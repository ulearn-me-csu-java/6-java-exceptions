package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        // здесь вы можете вручную протестировать ваше решение
        codeWithNPE();
    }

    static void codeWithNPE() {
        String str = null;
        str.length(); // вызов метода у null -> NullPointerException
    }
}
