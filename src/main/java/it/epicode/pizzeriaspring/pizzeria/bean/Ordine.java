package it.epicode.pizzeriaspring.pizzeria.bean;

import it.epicode.pizzeriaspring.pizzeria.enumeration.StatoOrdine;

import java.time.LocalTime;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalTime ora;
    private Tavolo tavolo;
    private List<Object> elementi;
    private double prezzoCoperto;

    public Ordine(int numeroOrdine, StatoOrdine stato, int numeroCoperti, Tavolo tavolo,
                  List<Object> elementi, double prezzoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.tavolo = tavolo;
        this.ora = LocalTime.now();
        this.elementi = elementi;
        this.prezzoCoperto = prezzoCoperto;
    }

    public double calcolaTotale() {
        double totale = numeroCoperti * prezzoCoperto;
        for (Object o : elementi) {
            if (o instanceof Pizza) totale += ((Pizza) o).getPrice();
            if (o instanceof Drink) totale += ((Drink) o).getPrice();
            if (o instanceof Topping) totale += ((Topping) o).getPrice();
        }
        return totale;
    }

    @Override
    public String toString() {
        return "Ordine #" + numeroOrdine + " - Tavolo: " + tavolo +
                " - Stato: " + stato + " - Totale: €" + calcolaTotale();
    }
}

