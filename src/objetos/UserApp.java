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
                    mostrarUsuarios(users);
                    break;

                case 2:
                    System.out.println("Introduce nombre:");
                    String nombreBuscar = sc.nextLine();
                    buscarUsuario(users, nombreBuscar);
                    break;

                case 3:
                    crearUsuario(users, sc);
                    break;

                case 4:
                    System.out.println("Introduce nombre:");
                    String nombreEliminar = sc.nextLine();
                    eliminarUsuario(users, nombreEliminar);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                case 6:
                    System.out.println("Nombre a buscar:");
                    String nombreBuscado = sc.nextLine();

                    editarUsuario(users, sc, nombreBuscado);
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);



    }

    //Metodo mostrarUsuarios

    public static void mostrarUsuarios(ArrayList<User> users) {

        for (User user : users) {
            System.out.println(user.obtenerInfo());
        }
    }

    //Metodo buscarUsuario

    public static void buscarUsuario(ArrayList<User> users, String nombreBuscado){
        boolean encontrado = false;
        for (User user : users){
            if (user.getNombre().equals(nombreBuscado)){
                System.out.println(user.obtenerInfo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Usuario no encontrado");
        }
    }

    //Metodo eliminarUsuario

    public static void eliminarUsuario(ArrayList<User> users, String nombreBuscado){
        boolean eliminado = false;
        for (int i = 0; i < users.size(); i++){

            if (users.get(i).getNombre().equals(nombreBuscado)){

                users.remove(i);

                eliminado = true;

                break;
            }
        }

        if (eliminado){

            System.out.println("Usuario eliminado");

        } else {

            System.out.println("Usuario no encontrado");
        }
    }

    //Metodo crearUsuario

    public static void crearUsuario(ArrayList<User> users, Scanner sc){
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Introduce email");
        String email = sc.nextLine();

        System.out.println("Introduce edad");
        int edad = sc.nextInt();

        User nuevoUsuario = new User(nombre, email, edad);
        users.add(nuevoUsuario);
        System.out.println("Usuario creado correctamente");
    }

    //Método editarUsuario

    public static void editarUsuario(ArrayList<User> users, Scanner sc ,String nombreBuscado){

        boolean encontrado = false ;

        for (User user : users){
            if(user.getNombre().equals(nombreBuscado)){

                System.out.println("Nuevo nombre el nombre ");
                String nuevoNombre = sc.nextLine();
                user.setNombre(nuevoNombre);

                System.out.println("Introduce la edad");
                int nuevaEdad = sc.nextInt();
                sc.nextLine();

                user.setEdad(nuevaEdad);

                System.out.println("Introduce el email ");
                String nuevoEmail = sc.nextLine();
                user.setEmail(nuevoEmail);

                encontrado = true;
                System.out.println("Usuario actualizado");
                break;
            }
        }if (!encontrado){ System.out.println("Usuario no entontrado");
        }
    }


}

