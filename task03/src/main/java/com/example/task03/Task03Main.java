package com.example.task03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task03Main {
    public static void main(String[] args) throws FileNotFoundException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        throwCheckedException();

    }


    public static void throwCheckedException() throws FileNotFoundException{
        throw new FileNotFoundException("Файл не найден.");
    }
}