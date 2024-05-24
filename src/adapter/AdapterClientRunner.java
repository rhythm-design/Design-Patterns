package adapter;

import adapter.impl.FancyMenuResturantAdapter;

public class AdapterClientRunner {

    public static void main(String[] args) {
        FancyMenuResturant fancyMenuResturant = new FancyMenuResturant();

        Resturant resturant = new FancyMenuResturantAdapter(fancyMenuResturant);

        resturant.orderFood(); // order samosa
        resturant.orderSpecialFood(); // order chole-bhature using the same interface
    }
}
