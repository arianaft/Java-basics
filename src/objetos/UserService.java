package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    //Metodo mostrarUsuarios

    public static void mostrarUsuarios(ArrayList<User> users){

        for(User user : users){
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


