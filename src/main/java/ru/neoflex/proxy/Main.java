package ru.neoflex.proxy;

public class Main {
    public static void main(String[] args) {
        RealDatabase realDatabase = new RealDatabase("postgresql");
        realDatabase.connect();

        Proxy proxy = new Proxy("localhost:port", "postgresql" );
        proxy.connect();
    }
}
