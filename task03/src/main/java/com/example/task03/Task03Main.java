package com.example.task03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        throwCheckedException();
    }

    public static void throwCheckedException() throws IOException {
        Files.readAllBytes(Path.of("a.txt"));
    }
}