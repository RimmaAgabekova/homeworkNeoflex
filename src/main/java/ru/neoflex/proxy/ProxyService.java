package ru.neoflex.proxy;

public class ProxyService {

    private final ProxyDB proxyDB;

    public ProxyService(ProxyDB proxyDB) {
        this.proxyDB = proxyDB;
    }

    public void connectToDB() {
        proxyDB.connect();
    }
}
