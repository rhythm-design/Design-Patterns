package decorator.impl;

import decorator.interfaces.Pizza;
import decorator.interfaces.PizzaTopping;

public class MozzarellaCheese implements PizzaTopping {
    Pizza pizza;

    public MozzarellaCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mozzarella Cheese";
    }

    @Override
    public int cost() {
        return 120 + pizza.cost();
    }
}
