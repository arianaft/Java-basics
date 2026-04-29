package condicionales;

import java.util.Scanner;

public class excondicional2 {
    public static void main(String[] args) {

        //2- Número par o impar

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num = sc.nextInt();
        if (num % 2 ==0){
            System.out.println("Es un numero par");
        }else{
            System.out.println("Es un numero impar"); }
    }
}
