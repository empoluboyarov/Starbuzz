package com.example.evgeniy.starbuzz;

/**
 * Created by Evgeniy on 06.04.2016.
 */
public class Drink {

    private String description;
    private String name;
    private int imageResourceID;

    public static final Drink[] drinks = {
            new Drink("Latte","A couple of espresso shots with steamed milk",R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh",R.drawable.filter)

    };

    public Drink(String name, String description, int imageResourceID) {
        this.description = description;
        this.imageResourceID = imageResourceID;
        this.name = name;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
