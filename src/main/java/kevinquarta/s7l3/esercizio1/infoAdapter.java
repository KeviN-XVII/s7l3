package kevinquarta.s7l3.esercizio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class infoAdapter implements DataSource{

    private Info info;
    public infoAdapter(Info info){
        super();
        this.info=info;
    }

    @Override
    public String getNomeCompleto(){
        return info.getNome()+info.getCognome();
    }

    @Override
    public int getEta(){
        LocalDate dataNascita = info.getDataDiNascita()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        return Period.between(dataNascita, LocalDate.now()).getYears();
    }

}
