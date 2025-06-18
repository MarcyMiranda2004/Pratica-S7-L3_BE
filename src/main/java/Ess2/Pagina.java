package Ess2;

public class Pagina implements LibroInt {
    private String contenuto;

    public Pagina(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina: " + contenuto);
    }
}

