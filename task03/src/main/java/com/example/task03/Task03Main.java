package com.example.task03;

import java.io.IOException;

public class Task03Main {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println("Поймали: " + e.getMessage());
        }
    }

    public static void throwCheckedException() throws IOException {
        throw new IOException("checked exception");
    }
}