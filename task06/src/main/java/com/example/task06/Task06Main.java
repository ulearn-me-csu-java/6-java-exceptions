package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
    }

    void printMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.print(stackTraceElements[2].getMethodName());
    }
}