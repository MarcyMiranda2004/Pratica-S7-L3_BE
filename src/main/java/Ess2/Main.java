package Ess2;

public class Main {
    public static void main(String[] args) {
        Pagina p1 = new Pagina("Introduzione");
        Pagina p2 = new Pagina("Contenuti base");

        Sezione sezione1 = new Sezione("Capitolo 1");
        sezione1.aggiungiElemento(p1);
        sezione1.aggiungiElemento(p2);

        Sezione sezione2 = new Sezione("Capitolo 2");
        sezione2.aggiungiElemento(new Pagina("Contenuti avanzati"));
        sezione2.aggiungiElemento(new Pagina("Esempi pratici"));

        Libro libro = new Libro("Manuale di Java", 29.90);
        libro.aggiungiAutore("Mario Rossi");
        libro.aggiungiAutore("Giulia Verdi");
        libro.aggiungiElemento(sezione1);
        libro.aggiungiElemento(sezione2);

        libro.stampa();

        System.out.println("Totale pagine: " + libro.getNumeroTotalePagine());
    }
}

