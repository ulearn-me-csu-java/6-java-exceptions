package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement[] elements = new Throwable().getStackTrace();
        System.out.print(elements[1].getMethodName());
    }
}