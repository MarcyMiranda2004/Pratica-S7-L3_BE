package Ess3;

public abstract class Ufficiale {
    protected Ufficiale superiore;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public void gestisciRichiesta(int importo) {
        if (getStipendio() >= importo) {
            System.out.println(getClass().getSimpleName() + " (" + getFunzione() + ") gestisce la richiesta. Stipendio: " + getStipendio() + "€");
        } else if (superiore != null) {
            System.out.println(getClass().getSimpleName() + " non può gestire. Passa al superiore...");
            superiore.gestisciRichiesta(importo);
        } else {
            System.out.println("Nessun ufficiale può gestire la richiesta di almeno " + importo + "€");
        }
    }

    public abstract int getStipendio();
    public abstract String getFunzione();
}
