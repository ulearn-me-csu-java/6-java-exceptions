package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
        Task07Main task = new Task07Main();
        task.processor = new Processor();
        String text = task.getExceptionType();
        System.out.println(text);
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
            return NONE;
        } catch (RuntimeException e) {
            return UNCHECKED;
        } catch (Exception e) {
            return CHECKED;
        }

    }
}