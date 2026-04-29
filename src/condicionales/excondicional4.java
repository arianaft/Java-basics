package condicionales;

import java.util.Scanner;

public class excondicional4 {
    public static void main(String[] args) {

        // 4- Pide dos números al usuario y muestra cuál es mayor o si son iguales
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer número");
        int numero1 = sc.nextInt();

        System.out.println("Dime otro número");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El mayor es " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El mayor es " + numero2);
        } else {
            System.out.println("Son iguales");
        }

    }
}