package objetos;
import java.util.ArrayList;
import java.util.Scanner;
public class UserApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creación lista
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Victoria", "vick@gmail.com", 20));
        users.add(new User("Pedro", "pedro@gmail.com", 30));
        users.add(new User("Susana", "sussana@gmail.com", 22));

        mostrarUsuarios(users);
        buscarUsuario(users, "Susana");
        eliminarUsuario(users, "Pedro");

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


}

