package condicionales;

import java.util.Scanner;

public class excondicional1 {
    public static void main(String[] args) {

        //1- Número positivo, negativo o cero

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("Numero positivo");
        }
        else if (num < 0) {
            System.out.println("Numero negativo");
        }else
        { System.out.println("El numero es 0"); }
    }
}
