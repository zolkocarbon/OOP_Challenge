package com.chrisz;

public class DeluxeBurger extends Hamburger {

    private boolean chips = true;
    private boolean drink = true;

    public DeluxeBurger() {
        super("Five Grain");
        this.setPrice(this.getPrice()+chipsPrice()+drinkPrice());
    }

    public double chipsPrice() {
        return 0.50;
    }

    public double drinkPrice() {
        return 0.60;
    }

    @Override
    public void getOrder() {
        printOrderBase();
        printToppings();
        if(chips) {
            System.out.println("Chips + $" + String.format("%.2f", chipsPrice()));
        }
        if(drink) {
            System.out.println("Drink + $" + String.format("%.2f", drinkPrice()));
        }
        printTotal();
    }
}
