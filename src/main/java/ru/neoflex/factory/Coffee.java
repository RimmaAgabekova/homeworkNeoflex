package ru.neoflex.factory;

public class Coffee {
    public static void main(String[] args) {
       CoffeeShop shop = new CoffeeShop(new SimpleCoffeeFactory());
       shop.orderCoffee(CoffeeType.AMERICANO);
    }
    public void brew() {

    }
}
