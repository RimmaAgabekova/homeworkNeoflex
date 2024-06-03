package ru.neoflex.adapter;


public class Computer extends USBAdapter {
    private final MemoryCards memoryCards;

    public Computer(MemoryCards memoryCards) {
        this.memoryCards = memoryCards;
    }
    @Override
    public void connectWithUsbCable() {
        this.memoryCards.insert();
        this.memoryCards.copyData();
    }


    public static void main(String[] args) {

        USBAdapter cardReader = new Computer(new MemoryCards());
        cardReader.connectWithUsbCable();

    }

}
