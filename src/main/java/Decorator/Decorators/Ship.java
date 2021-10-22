package Decorator.Decorators;

import Decorator.Main.Beverage;

public class Ship extends Beverage {
    Beverage beverage;

    public Ship(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Ship";
    }

    public double cost() {
        return .32 + beverage.cost();
    }
}
