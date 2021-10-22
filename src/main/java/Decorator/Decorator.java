package Decorator;

/*
    Паттерн Декоратор динамически наделяет объект новыми
    возможностями и является гибкой альтернативой субкласси-
    рованию в области расширения функциональности.
*/

import Decorator.Decorators.Mocha;
import Decorator.Decorators.Ship;
import Decorator.Decorators.Whip;
import Decorator.Main.Beverage;
import Decorator.Main.Espresso;
import Decorator.Main.HouseBlend;

public class Decorator {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Ship(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Ship(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
