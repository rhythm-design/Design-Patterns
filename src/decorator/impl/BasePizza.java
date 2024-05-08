package decorator.impl;

import decorator.interfaces.Pizza;

public class BasePizza implements Pizza {

    String description;

    public BasePizza() {
        this.description = "Pizza";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int cost() {
        return 0;
    }
}
