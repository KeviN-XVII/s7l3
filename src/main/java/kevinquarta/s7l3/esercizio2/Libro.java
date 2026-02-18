package kevinquarta.s7l3.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    public String titolo;
    private double prezzo;
    private List<String> autori = new ArrayList<>();
    private List<ElementoLibro> elementi = new ArrayList<>();


    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    
}
