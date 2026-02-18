package kevinquarta.s7l3.esercizio3;

public class Colonnello extends Maggiore{

    @Override
    public void verifica(int importo){
        if(importo>=4000){
            System.out.println("Posso essere un COLONNELLO");
            this.next(importo);
        }else {
            System.out.println("NON posso essere un COLONNELLO");
        }
    }
}
