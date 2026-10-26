package com.example.task04;

/**
 * Собственное исключение, наследующее IllegalArgumentException.
 */
public class MyException extends IllegalArgumentException {

    // конструктор принимающий сообщение об ошибке
    public MyException(String message) {
        // передаем сообщение в родительский класс
        super(message);
    }
}