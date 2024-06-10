package ru.neoflex.singleton;


public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        TestClass testClass = new TestClass();
        logger.classLog(testClass, "Some info");
    }
}
