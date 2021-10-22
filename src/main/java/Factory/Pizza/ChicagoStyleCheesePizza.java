package Factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.name = "Chicago Style Deep Dish Cheese Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarells Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
