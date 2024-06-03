package ru.neoflex.proxy;

public class RealDatabase implements DataBase {
    private final String dataBaseName;

    public RealDatabase(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    @Override
    public void connect() {
        System.out.println("Соединение с базой данных - " + dataBaseName);

    }

}
