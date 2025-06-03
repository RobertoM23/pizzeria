package it.epicode.pizzeriaspring.pizzeria.configuration;
import it.epicode.pizzeriaspring.pizzeria.bean.Drink;
import it.epicode.pizzeriaspring.pizzeria.bean.Menu;
import it.epicode.pizzeriaspring.pizzeria.bean.Pizza;
import it.epicode.pizzeriaspring.pizzeria.bean.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public Topping cheese() { return new Topping("Cheese", 92, 0.69); }

    @Bean
    public Topping ham() { return new Topping("Ham", 35, 0.99); }

    @Bean
    public Topping pineapple() { return new Topping("Pineapple", 24, 0.79); }

    @Bean
    public Topping salami() { return new Topping("Salami", 86, 0.99); }

    @Bean
    public List<Topping> allToppings() {
        return Arrays.asList(cheese(), ham(), pineapple(), salami());
    }

    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", List.of(cheese()), 1104, 4.99);
    }

    @Bean
    public Pizza hawaiian() {
        return new Pizza("Hawaiian Pizza", List.of(cheese(), ham(), pineapple()), 1024, 6.49);
    }

    @Bean
    public Pizza salamiPizza() {
        return new Pizza("Salami Pizza", List.of(cheese(), salami()), 1160, 5.99);
    }

    @Bean
    public List<Pizza> allPizzas() {
        return Arrays.asList(margherita(), hawaiian(), salamiPizza());
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade", "0.33l", 128, 1.29);
    }

    @Bean
    public Drink water() {
        return new Drink("Water", "0.5l", 0, 1.29);
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine", "0.75l, 13%", 607, 7.49);
    }

    @Bean
    public List<Drink> allDrinks() {
        return Arrays.asList(lemonade(), water(), wine());
    }

    @Bean
    public Menu menu() {
        return new Menu(allPizzas(), allToppings(), allDrinks());
    }
}
