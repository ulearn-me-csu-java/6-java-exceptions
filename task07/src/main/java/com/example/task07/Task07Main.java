package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
            return NONE;
        } catch (RuntimeException exception) {
            return UNCHECKED;
        } catch (Exception exception) {
            return CHECKED;
        }
    }

}