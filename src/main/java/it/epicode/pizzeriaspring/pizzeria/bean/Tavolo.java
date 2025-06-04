package it.epicode.pizzeriaspring.pizzeria.bean;

public class Tavolo {
    private int numero;
    private int copertiMax;
    private boolean occupato;

    public Tavolo(int numero, int copertiMax, boolean occupato) {
        this.numero = numero;
        this.copertiMax = copertiMax;
        this.occupato = occupato;
    }

    public int getNumero() { return numero; }
    public int getCopertiMax() { return copertiMax; }
    public boolean isOccupato() { return occupato; }

    @Override
    public String toString() {
        return "Tavolo " + numero + " (max " + copertiMax + ", " + (occupato ? "occupato" : "libero") + ")";
    }
}
