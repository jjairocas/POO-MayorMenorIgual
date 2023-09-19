package AppMayorMenoroIgual;

public class Comparador {
    int ValorA;
    int ValorB;

    public Comparador(int valorA, int valorB) {
        this.ValorA = valorA;
        this.ValorB = valorB;
    }
    String Comparador(){
        if(ValorA>ValorB){
            return "A es Mayor que B";
        } else if (ValorA == ValorB) {
            return "A es Igual a B";
        }
        else{
            return "A es Menor que B";
        }

    }


}
