package ru.neoflex.singleton;

import java.time.LocalDate;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public static void classLog(Object obj, String info) {
        String className = obj.getClass().getSimpleName();

        StringBuffer stringBuffer = new StringBuffer();

        System.out.println(stringBuffer
                .append("Log info: ")
                .append(LocalDate.now())
                .append(" ")
                .append(className)
                .append(" ")
                .append(info));

    }
}
