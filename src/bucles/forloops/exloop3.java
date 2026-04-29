package bucles.forloops;

public class exloop3 {
    public static void main(String[] args) {
        //3- Controla el número de repeticiones del bucle
        int intentos = 0;
        do{
            System.out.println("Cargando..." + intentos);
            intentos++;
        }while(intentos < 4);
    }
}
