package objetos;

public class User {
    private String nombre;
    private String email;
    private int edad;

    //Constructor
    public User(String nombre, String email, int edad){
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getEmail(){
        return email;
    }
    public int getEdad(){
        return edad;
    }
    public String obtenerInfo(){
        return "Nombre: " + nombre +
                ", Email: " + email +
                ", Edad: " + edad;
    }


}

