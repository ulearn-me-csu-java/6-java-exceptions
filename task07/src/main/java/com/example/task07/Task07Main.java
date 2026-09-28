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
        } catch (RuntimeException e) {
            // RuntimeException (и его наследники) — unchecked
            return UNCHECKED;
        } catch (Exception e) {
            // Всё остальное, унаследованное от Exception, но не от RuntimeException — checked
            return CHECKED;
        }
        // Если исключение не выброшено — дошли до этой строки
        return NONE;
    }

}