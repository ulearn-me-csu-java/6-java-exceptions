package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    Processor processor = new Processor();

    public String getExceptionType() {
        try {
            processor.process();
            return NONE;
        } catch (RuntimeException | Error e) {
            return UNCHECKED;
        } catch (Exception e) {
            return CHECKED;
        }
    }
}