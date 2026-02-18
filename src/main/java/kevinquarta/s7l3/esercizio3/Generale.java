package kevinquarta.s7l3.esercizio3;

public class Generale extends Colonnello{

    @Override
    public void verifica(int importo){
        if(importo>=5000){
            System.out.println("Posso essere un GENERALE");
            this.next(importo);
        }else {
            System.out.println("NON posso essere un GENERALE");
        }
    }

}
