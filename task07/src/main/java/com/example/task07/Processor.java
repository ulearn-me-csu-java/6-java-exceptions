package com.example.task07;

public class Processor {

    public Object process() throws Exception {
        //todo вы можете заменить реализацию этого метода для ручного дебага
        return null;
    }

    public String getExceptionType() {
        try {
            process();
            return "none";
        } catch (RuntimeException | Error e) {
            return "unchecked";
        } catch (Exception e) {
            return "checked";
        }
    }
}
