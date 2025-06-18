package Ess3;

public class Main {
    public static void main(String[] args) {
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        System.out.println("Richiesta 900€:");
        tenente.gestisciRichiesta(900);

        System.out.println("\nRichiesta 2500€:");
        tenente.gestisciRichiesta(2500);

        System.out.println("\nRichiesta 5000€:");
        tenente.gestisciRichiesta(5000);

        System.out.println("\nRichiesta 6000€:");
        tenente.gestisciRichiesta(6000);
    }
}
