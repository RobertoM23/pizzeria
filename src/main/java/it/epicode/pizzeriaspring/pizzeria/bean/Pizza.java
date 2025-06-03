package it.epicode.pizzeriaspring.pizzeria.bean;
import java.util.List;

public class Pizza {
    private String name;
    private List<Topping> toppings;
    private int calories;
    private double price;

    public Pizza(String name, List<Topping> toppings, int calories, double price) {
        this.name = name;
        this.toppings = toppings;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + toppings + " - " + calories + " cal - €" + price;
    }
}