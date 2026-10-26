package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        // получаем стек вызовов текущего потока
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        // элемент с индексом 0 - это сам метод printMethodName
        // элемент с индексом 1 - это тот кто его вызвал (main)
        String callerMethodName = stackTrace[1].getMethodName();

        System.out.println(callerMethodName);
    }
}