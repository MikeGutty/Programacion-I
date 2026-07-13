package Functions;

public class Persona {
    // Atributos
    static int edad;
    static int CI;
    static String nombre;
    static String colorPiel;

    // Funciones
    static String saludo(){
        String resultado = "Hola mi nombre es " + nombre + " mi edad es " + edad + " mi carnet de identidad es " + CI +" y mi color de piel es " + colorPiel;
        return resultado;
    }
}
