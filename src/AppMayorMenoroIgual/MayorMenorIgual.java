package AppMayorMenoroIgual;

import java.util.*;

public class MayorMenorIgual {
    public static void main(String[] args) {

        MayoroMenorIgual form = new MayoroMenorIgual();
        form.setVisible(true);

    }
}


/*Calculo de las operaciones sin utilizar la Clase
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese valor A");
        int A= input.nextInt();
        System.out.println("Ingrese valor B");
        int B= input.nextInt();

        Comparador Compara=new Comparador(A,B);
        String Resultado=Compara.Comparador();
        System.out.println(Resultado);


        if(A>B){
            System.out.println("A es Mayor que B");
        } else if (A == B) {
            System.out.println("A es igual B");
        }
        else{
            System.out.println("A es menor que B");
        }*/