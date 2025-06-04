package it.epicode.pizzeriaspring.pizzeria.bean;

public class Topping {
    private String name;
    private int calories;
    private double price;

    public Topping(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + calories + " cal, €" + price + ")";
    }
}
