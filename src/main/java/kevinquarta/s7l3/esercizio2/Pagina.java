package kevinquarta.s7l3.esercizio2;

public class Pagina implements ElementoLibro{

    public String contenuto;

    public Pagina(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public void stampa(){
        System.out.println("Pagina: " + contenuto);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }

}
