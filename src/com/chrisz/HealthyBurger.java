package com.chrisz;

public class HealthyBurger extends Hamburger {
    private boolean spinach = false;

    public HealthyBurger() {
        super("Brown Rye");
        this.setPrice(1.50);
    }

    public void addSpinach() {
        spinach = true;
        this.setPrice(this.getPrice() + spinachPrice());
    }

    public double spinachPrice() {
        return 0.50;
    }

    @Override
    public void getOrder() {
        printOrderBase();
        printToppings();
        if(spinach) {
            System.out.println("Spinach + $" + String.format("%.2f", spinachPrice()));
        }
        printTotal();
    }

}
