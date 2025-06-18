package Ess3;

public class Tenente extends Ufficiale {
    @Override
    public int getStipendio() {
        return 1000;
    }

    @Override
    public String getFunzione() {
        return "Coordinamento truppe di fanteria";
    }
}
