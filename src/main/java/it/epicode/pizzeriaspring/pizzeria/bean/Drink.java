package it.epicode.pizzeriaspring.pizzeria.bean;

public class Drink {
    private String name;
    private String quantity;
    private int calories;
    private double price;

    public Drink(String name, String quantity, int calories, double price) {
        this.name = name;
        this.quantity = quantity;
        this.calories = calories;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + ") - " + calories + " cal - €" + price;
    }
}

