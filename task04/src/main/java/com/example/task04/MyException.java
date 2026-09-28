package com.example.task04;

import java.io.PrintStream;

public class MyException extends IllegalArgumentException {

    public MyException(String message) {
        super(message);
    }
}
