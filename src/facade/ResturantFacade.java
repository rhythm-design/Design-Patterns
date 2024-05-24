package facade;

import facade.subsystems.Chef;
import facade.subsystems.Waiter;

public class ResturantFacade {

    private Chef chef;
    private Waiter waiter;

    public ResturantFacade() {
        this.chef = new Chef();
        this.waiter = new Waiter();
    }

    public void orderSpecialMeal() {
        chef.cookBurger();
        chef.prepareFries();
        chef.pourSoftDrink();
        waiter.serveBurger();
        waiter.serveFries();
        waiter.serveSoftDrink();
    }
}
