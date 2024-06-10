package ru.neoflex.adapter;

public class AdapterToMemoryCard implements USB {
    private final USB usb;

    public AdapterToMemoryCard(USB usb) {
        this.usb = usb;
    }

    @Override
    public void connect() {
        usb.connect();

    }
}
