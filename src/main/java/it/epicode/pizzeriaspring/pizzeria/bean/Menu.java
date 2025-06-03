package it.epicode.pizzeriaspring.pizzeria.bean;
import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public void printMenu() {
        System.out.println("Pizzas:");
        pizzas.forEach(System.out::println);
        System.out.println("\nToppings:");
        toppings.forEach(System.out::println);
        System.out.println("\nDrinks:");
        drinks.forEach(System.out::println);
    }
}
