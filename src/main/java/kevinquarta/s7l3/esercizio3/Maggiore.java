package kevinquarta.s7l3.esercizio3;

public class Maggiore extends Capitano {

    @Override
    public void verifica(int importo){
        if(importo>=3000){
            System.out.println("Posso essere un MAGGIORE");
            this.next(importo);
        }else {
            System.out.println("NON posso essere un MAGGIORE");
        }
    }

}
