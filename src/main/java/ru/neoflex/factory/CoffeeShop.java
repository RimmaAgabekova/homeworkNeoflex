package ru.neoflex.factory;

public class CoffeeShop {
    private final SimpleCoffeeFactory coffeeFactory;
    public CoffeeShop(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.brew();
        System.out.println("-------------------------------------");
        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }
}
