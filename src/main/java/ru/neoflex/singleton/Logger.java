package ru.neoflex.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    public static void main(String[] args) {
    classLog(getInstance(), "Some info");
    }
    private static Logger instance;

    private Logger() {}
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public static void classLog(Object obj, String info) {
        String className = obj.getClass().getSimpleName();
        System.out.println("Log info: " + new SimpleDateFormat("yy.MM.dd").format(new Date()) + " - " + className + " - " + info);
    }

}
