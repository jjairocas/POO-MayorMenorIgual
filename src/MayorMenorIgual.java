import java.util.*;

public class MayorMenorIgual {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese valor A");
        int A= input.nextInt();
        System.out.println("Ingrese valor B");
        int B= input.nextInt();

        if(A>B){
            System.out.println("A es Mayor que B");
        } else if (A == B) {
            System.out.println("A es igual B");
        }
        else{
            System.out.println("A es menor que B");
        }
    }
}