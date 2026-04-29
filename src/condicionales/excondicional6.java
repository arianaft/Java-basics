package condicionales;

import java.util.Scanner;

public class excondicional6 {

    //6- Nota de estudiante

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nota de 0 a 10");
        int nota = sc.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else if (nota <= 4) {
            System.out.println("Suspenso");
        } else if (nota <= 6) {
            System.out.println("Aprobado");
        } else if (nota <= 8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}
