package ru.neoflex.adapter;


public class Computer {
    private final USB usb;

    public Computer(USB usb) {
        this.usb = usb;
    }

    public void read() {
        usb.connect();
    }
}
