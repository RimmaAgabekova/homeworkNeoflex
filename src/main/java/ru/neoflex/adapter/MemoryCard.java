package ru.neoflex.adapter;

public class MemoryCard implements USB {

    @Override
    public void connect() {
        System.out.println("Данные считаны");

    }
}
