package ru.neoflex.factory;

public class Espresso extends Coffee {
    @Override
    public void brew() {
        System.out.println("Приготовление Эспрессо. Ожидайте");
    }
}
