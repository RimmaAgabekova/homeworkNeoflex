package ru.neoflex.adapter;

public class Main {
    public static void main(String[] args) {

        MemoryCard memoryCard = new MemoryCard();
        AdapterToMemoryCard adapterToMemoryCard = new AdapterToMemoryCard(memoryCard);
        Computer computer = new Computer(adapterToMemoryCard);

        computer.read();
    }
}
