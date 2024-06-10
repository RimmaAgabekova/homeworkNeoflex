package ru.neoflex.proxy;

public class ProxyDB implements DataBaseConnection {
    private final DataBaseConnection dataBaseConnection;

    public ProxyDB(DataBaseConnection dataBaseConnection) {
        this.dataBaseConnection = dataBaseConnection;
    }

    @Override
    public void connect() {
        System.out.print("Вы подключены к: http://localhost:8080/");
        dataBaseConnection.connect();
    }
}
