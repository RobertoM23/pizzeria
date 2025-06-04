package it.epicode.pizzeriaspring.pizzeria;
import it.epicode.pizzeriaspring.pizzeria.bean.*;
import it.epicode.pizzeriaspring.pizzeria.enumeration.StatoOrdine;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTests {

    @Test
    void testToppingCreation() {
        Topping cheese = new Topping("Cheese", 92, 0.69);
        assertEquals("Cheese", cheese.toString().split(" ")[0]);
    }

    @Test
    void testOrdineTotale() {
        Tavolo tavolo = new Tavolo(1, 4, true);
        Pizza pizza = new Pizza("Test Pizza", List.of(new Topping("Cheese", 100, 1.0)), 1000, 5.0);
        Drink drink = new Drink("Water", "0.5l", 0, 1.5);
        Ordine ordine = new Ordine(1, StatoOrdine.IN_CORSO, 2, tavolo, List.of(pizza, drink), 2.0);

        double expected = 2 * 2.0 + 5.0 + 1.5;
        assertEquals(expected, ordine.calcolaTotale(), 0.01);
    }

    @Test
    void testTavoloLibero() {
        Tavolo tavolo = new Tavolo(5, 6, false);
        assertTrue(tavolo.toString().contains("libero"));
    }

    @Test
    void testOrdineSoloTopping() {
        Tavolo tavolo = new Tavolo(2, 2, true);
        Topping ham = new Topping("Ham", 30, 0.99);
        Ordine ordine = new Ordine(2, StatoOrdine.IN_CORSO, 1, tavolo, List.of(ham, ham), 2.5);

        double expected = 2.5 + 0.99 * 2;
        assertEquals(expected, ordine.calcolaTotale(), 0.01);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0.0",
            "1,2.5",
            "3,7.5"
    })
    void testCostoCoperto(int coperti, double expected) {
        Tavolo tavolo = new Tavolo(3, 4, true);
        Ordine ordine = new Ordine(3, StatoOrdine.IN_CORSO, coperti, tavolo, List.of(), 2.5);
        assertEquals(expected, ordine.calcolaTotale(), 0.01);
    }
}
