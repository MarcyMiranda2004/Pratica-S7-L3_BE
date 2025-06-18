package Ess2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements LibroInt {
    private String titolo;
    private List<LibroInt> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiElemento(LibroInt elemento) {
        elementi.add(elemento);
    }

    @Override
    public int getNumeroPagine() {
        return elementi.stream().mapToInt(LibroInt::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (LibroInt e : elementi) {
            e.stampa();
        }
    }
}

