package ru.neoflex.proxy;

public class RealDatabase implements DataBaseConnection {

    private static final String DATABASE_NAME = "proxy_db";

    @Override
    public void connect() {
        System.out.println(DATABASE_NAME);
    }

}
