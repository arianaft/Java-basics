package condicionales;

import java.util.Scanner;

public class excondicional3 {
    public static void main(String[] args) {

        //3- Mayor de edad

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{ System.out.println("Todavía eres menor"); }
    }
}
