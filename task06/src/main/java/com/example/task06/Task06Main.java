package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        new Task06Main().printMethodName();

    }

    void printMethodName() {
        Exception e = new Exception();

        StackTraceElement[] str = e.getStackTrace();

        System.out.print(str[1].getMethodName());
    }

}