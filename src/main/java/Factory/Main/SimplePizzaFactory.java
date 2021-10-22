package Factory.Main;

import Factory.Pizza.CheesePizza;
import Factory.Pizza.Pizza;
import Factory.Pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String name) {
        Pizza pizza = null;

        if(name.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (name.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
