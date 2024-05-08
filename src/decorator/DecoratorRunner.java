package decorator;

import decorator.impl.*;
import decorator.interfaces.Pizza;

public class DecoratorRunner {

    public static void main(String[] args) {
        Pizza pizza = new BasePizza();
        pizza = new WheatThinCrust(pizza);
        System.out.println(pizza.getDescription() + " for a total cost of " + pizza.cost());
        pizza = new Capsicum(pizza);
        System.out.println(pizza.getDescription() + " for a total cost of " + pizza.cost());
        pizza = new MozzarellaCheese(pizza);
        System.out.println(pizza.getDescription() + " for a total cost of " + pizza.cost());
        pizza = new Jalapeno(pizza);
        System.out.println(pizza.getDescription() + " for a total cost of " + pizza.cost());
        pizza = new CheddarCheese(pizza);
        System.out.println(pizza.getDescription() + " for a total cost of " + pizza.cost());
    }
}
