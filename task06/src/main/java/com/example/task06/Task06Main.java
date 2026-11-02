package com.example.task06;

import java.util.Optional;
import java.lang.StackWalker.StackFrame;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        // Ищем первый метод в стеке, который не относится к JUnit, рефлексии или самому StackWalker
        Optional<StackFrame> caller = StackWalker.getInstance().walk(stream ->
                stream.filter(frame -> !frame.getClassName().startsWith("java."))
                        .filter(frame -> !frame.getClassName().startsWith("jdk."))
                        .filter(frame -> !frame.getClassName().startsWith("org.junit."))
                        .filter(frame -> !frame.getClassName().startsWith("com.intellij.")) // на случай запуска в IDEA
                        .filter(frame -> !frame.getMethodName().equals("printMethodName")) // пропускаем сам текущий метод
                        .findFirst()
        );

        // Выводим имя метода и обязательно добавляем \n для соответствия ожиданиям теста
        caller.ifPresent(frame -> System.out.print(frame.getMethodName() + "\n"));
    }
}