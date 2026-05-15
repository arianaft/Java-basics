package objetos;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class UserApp {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int opcion;

        // Creación lista
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Victoria", "vick@gmail.com", 20));
        users.add(new User("Pedro", "pedro@gmail.com", 30));
        users.add(new User("Susana", "sussana@gmail.com", 22));

        //Opcion menu
        do {

            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar usuarios");
            System.out.println("2. Buscar usuario");
            System.out.println("3. Crear usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Salir");
            System.out.println("6. Editar usuario");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    UserService.mostrarUsuarios(users);
                    break;

                case 2:
                    System.out.println("Introduce nombre:");
                    String nombreBuscar = sc.nextLine();
                    UserService.buscarUsuario(users, nombreBuscar);
                    break;

                case 3:
                    UserService.crearUsuario(users, sc);
                    break;

                case 4:
                    System.out.println("Introduce nombre:");
                    String nombreEliminar = sc.nextLine();
                    UserService.eliminarUsuario(users, nombreEliminar);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                case 6:
                    System.out.println("Nombre a buscar:");
                    String nombreBuscado = sc.nextLine();

                    UserService.editarUsuario(users, sc, nombreBuscado);
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);


    }

}








