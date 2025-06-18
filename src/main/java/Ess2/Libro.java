package Ess2;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titolo;
    private List<String> autori = new ArrayList<>();
    private double prezzo;
    private List<LibroInt> elementi = new ArrayList<>();

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void aggiungiElemento(LibroInt elemento) {
        elementi.add(elemento);
    }

    public int getNumeroTotalePagine() {
        return elementi.stream().mapToInt(LibroInt::getNumeroPagine).sum();
    }

    public void stampa() {
        System.out.println("Libro: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + "€");
        for (LibroInt e : elementi) {
            e.stampa();
        }
    }
}
