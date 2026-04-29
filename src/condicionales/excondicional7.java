package condicionales;

import java.util.Scanner;

public class excondicional7 {

    //7-Calculadora

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = sc.nextInt();

        System.out.println("Dime otro numero");
        int num2 = sc.nextInt();

        System.out.println("Dime la operacion (+, -, *, /)");
        String operacion = sc.next();

        switch (operacion) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case "/":
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: no se puede dividir entre 0");
                }
                break;

            default:
                System.out.println("Operacion no valida");
        }
    }
}
