package kevinquarta.s7l3.esercizio3;

public class Capitano extends Tenente{

    @Override
    public void verifica(int importo){
        if(importo>=2000){
            System.out.println("Posso essere un CAPITANO");
            this.next(importo);
        }else {
            System.out.println("NON posso essere un CAPITANO");
        }
    }

}
