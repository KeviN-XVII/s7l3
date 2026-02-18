package kevinquarta.s7l3.esercizio2;

import java.util.List;

public class Sezione implements ElementoLibro{

    private String titolo;
    private List<ElementoLibro> elementi;

    public Sezione(String titolo) {
        this.titolo = titolo;
    }


    public void aggiungiElemento(ElementoLibro elemento) {
        elementi.add(elemento);
    }

    @Override
    public void stampa(){
        System.out.println("Sezione: " + titolo);

        for (int i = 0; i < elementi.size(); i++) {
            ElementoLibro elemento = elementi.get(i);
            elemento.stampa();
        }


    }

    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (int i = 0; i < elementi.size(); i++) {
            ElementoLibro elemento = elementi.get(i);
            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }


}
