package com.chrisz;

public class Hamburger {
    private String breadRoll = "Wheat";
    private String meat = "Beef";
    private double price = 1.00;
    private boolean lettuce = false;
    private boolean tomatoe = false;

    public Hamburger() {
    }

    public Hamburger(String breadRoll) {
        this.breadRoll = breadRoll;
    }


    public boolean deluxeBurger() {
        if(burgerType().equals("DeluxeBurger")) {
            System.out.println("Cannot add additional toppings to a deluxe burger");
            return true;
        }
        return false;
    }

    public void addLettuce() {
        if(!deluxeBurger()) {
            lettuce = true;
            price += lettucePrice();
        }
    }

    public double lettucePrice() {
        return 0.10;
    }

    public void addTomato() {
        if(!deluxeBurger()) {
            tomatoe = true;
            price += tomatoPrice();
        }
    }

    public double tomatoPrice() {
        return 0.25;
    }

    public void getOrder() {
        printOrderBase();
        printToppings();
        printTotal();
    }

    public void printOrderBase() {
        if(burgerType().equals("Hamburger")) {
            System.out.println("A hamburger was ordered with");
        }
        if(burgerType().equals("HealthyBurger")) {
            System.out.println("A healthy burger was ordered with");
        }
        if(burgerType().equals("DeluxeBurger")) {
            System.out.println("A deluxe burger was ordered with");
        }
        System.out.println("Bread: " + breadRoll);
        System.out.println("Meat: " + meat);
    }

    public void printToppings() {
        if(lettuce) {
            System.out.println("Lettuce + $" + String.format("%.2f", lettucePrice()));
        }
        if(tomatoe) {
            System.out.println("Tomatoe + $" + String.format("%.2f", tomatoPrice()));
        }
    }

    public void printTotal() {
        System.out.println("Total: $" + String.format("%.2f", price));
    }

    public String burgerType() {
        return this.getClass().getSimpleName();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }
}
