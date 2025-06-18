package Ess1;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

    @Override
    public String toString() {
        return "Nome completo: " + nomeCompleto + ", Età: " + eta;
    }
}

