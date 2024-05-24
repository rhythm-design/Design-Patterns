package adapter.impl;

import adapter.FancyMenuResturant;
import adapter.Resturant;


// Adapter Class- adapting the fancy names in menu and giving easy way to order
public class FancyMenuResturantAdapter implements Resturant {

    private FancyMenuResturant fancyMenuResturant;

    public FancyMenuResturantAdapter(FancyMenuResturant fancyMenuResturant) {
        this.fancyMenuResturant = fancyMenuResturant;
    }

    @Override
    public void orderFood() {
        fancyMenuResturant.cookPotatoFilledFriedPastry();
    }

    @Override
    public void orderSpecialFood() {
        fancyMenuResturant.chickpeaCurryWithFriedFlatBreads();
    }
}
