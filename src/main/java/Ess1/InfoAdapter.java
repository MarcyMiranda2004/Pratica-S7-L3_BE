package Ess1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.time.Period;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Date dataNascita = info.getDataDiNascita();
        LocalDate nascita = dataNascita.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate oggi = LocalDate.now();
        return Period.between(nascita, oggi).getYears();
    }
}
