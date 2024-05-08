package decorator.impl;

import decorator.interfaces.Pizza;
import decorator.interfaces.PizzaTopping;

public class CheddarCheese implements PizzaTopping {

    Pizza pizza;

    public CheddarCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheddar Cheese";
    }

    @Override
    public int cost() {
        return 80 + pizza.cost();
    }
}
