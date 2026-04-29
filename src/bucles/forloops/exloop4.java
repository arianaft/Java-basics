package bucles.forloops;

public class exloop4 {
    public static void main(String[] args) {
        //4-Calcula la suma de un array de números y luego muestra cada elemento
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;
        for (int i= 0; i< numeros.length; i++){
            suma = suma + numeros[i];
        }
        System.out.println("La suma es :" + suma);

        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}
