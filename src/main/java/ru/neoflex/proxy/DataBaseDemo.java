package ru.neoflex.proxy;

public class DataBaseDemo {
    public static void main(String[] args) {
        RealDatabase database = new RealDatabase();
        ProxyDB proxyDB = new ProxyDB(database);

        ProxyService proxyService = new ProxyService(proxyDB);
        proxyService.connectToDB();

    }
}
