package decorator.impl;

import decorator.interfaces.Pizza;
import decorator.interfaces.PizzaTopping;

public class Jalapeno implements PizzaTopping {

    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jalapeno";
    }

    @Override
    public int cost() {
        return 40 + pizza.cost();
    }
}
