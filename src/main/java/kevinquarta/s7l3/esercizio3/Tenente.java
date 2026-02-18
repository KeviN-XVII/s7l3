package kevinquarta.s7l3.esercizio3;


import lombok.Setter;

@Setter
public class Tenente {

    private Tenente next;

    public void verifica(int importo){
        if(importo>=1000){
            System.out.println("Posso essere un TENENTE");
            this.next(importo);
        }else {
            System.out.println("NON posso essere un TENENTE");
        }
    }

    public void next(int importo){
        if(this.next != null){
            this.next.verifica(importo);
        }else  {
            System.out.println("Verifica Completata");
        }
    }

}
