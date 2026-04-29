package condicionales;

import java.util.Scanner;

public class excondicional5 {
    public static void main(String[] args) {

        //5-Mayor de tres números

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt(); System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt(); System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor es " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor es " + num2);
        } else {
            System.out.println("El mayor es " + num3);
        }
    }
}
