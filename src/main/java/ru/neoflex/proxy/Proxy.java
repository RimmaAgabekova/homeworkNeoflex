package ru.neoflex.proxy;

public class Proxy implements DataBase {
    private final String proxyUrl;
    private final RealDatabase realDataBase;

    public Proxy(String proxyUrl, String nameDataBase) {
        this.proxyUrl = proxyUrl;
        this.realDataBase = new RealDatabase(nameDataBase);
    }
    @Override
    public void connect() {
        System.out.println("Подключение к базе данных через прокси " + proxyUrl + "/" + realDataBase);
    }
}
