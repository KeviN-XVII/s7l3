package kevinquarta.s7l3.esercizio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
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

        Date dataDiNascita = info.getDataDiNascita();
        Calendar nascita = Calendar.getInstance();//crea un calendario per poi assegnare cal.setTime
        nascita.setTime(dataDiNascita); // rende il calendar una data
        Calendar now = Calendar.getInstance();// oggi
        int eta = now.get(Calendar.YEAR)-nascita.get(Calendar.YEAR);
        return eta;
    }

}
