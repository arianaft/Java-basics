package condicionales;

import java.util.Scanner;

public class excondiconal8 {
    public static void main(String[] args) {

        //8- Año bisiesto

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año");

        int anio = sc.nextInt();
        if (anio % 4 == 0) {
            if (anio % 100 != 0) {
                System.out.println("Es bisiesto");
            } else {
                if (anio % 400 == 0) {
                    System.out.println("Es bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            }
        } else {
            System.out.println("No es bisiesto");
        }


    }
}
