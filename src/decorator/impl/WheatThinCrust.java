package decorator.impl;

import decorator.interfaces.Pizza;
import decorator.interfaces.PizzaTopping;

public class WheatThinCrust implements PizzaTopping {

    Pizza pizza;

    public WheatThinCrust(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", With Wheat base";
    }

    @Override
    public int cost() {
        return 60 + pizza.cost();
    }
}
