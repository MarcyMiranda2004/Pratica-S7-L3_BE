package Ess3;

public class Capitano extends Ufficiale {
    @Override
    public int getStipendio() {
        return 2000;
    }

    @Override
    public String getFunzione() {
        return "Supervisione plotoni";
    }
}
