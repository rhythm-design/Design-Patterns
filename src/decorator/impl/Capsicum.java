package decorator.impl;

import decorator.interfaces.Pizza;
import decorator.interfaces.PizzaTopping;

public class Capsicum implements PizzaTopping {

    Pizza pizza;

    public Capsicum(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Capsicum";
    }

    @Override
    public int cost() {
        return 10 + pizza.cost();
    }
}
