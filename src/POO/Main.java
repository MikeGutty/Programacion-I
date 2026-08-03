package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creacion de un objeto de tipo Triangulo
        Triangulo figura = new Triangulo();

        figura.lado = 5;
        figura.altura = 7;
        figura.base = 3;

        System.out.println("El area del triangulo es: " + figura.area());
        System.out.println("El perimetor del triangulo es: " + figura.perimetro());

        //Creacion de un objeto de tipo Rectangulo
        Rectangulo objeto = new Rectangulo();

        objeto.lado = 8;
        objeto.base = 6;
        objeto.altura = 7;

        System.out.println("El area del rectangulo es: " + objeto.area());
        System.out.println("El perimetro del rectangulo es: " + objeto.perimetro());

        // Creacion de un objeto de tipo Persona
        Persona estudiante = new Persona();

        estudiante.nombre = "Erlan";
        estudiante.apellido = "Uria";
        estudiante.CI = 8907826;
        estudiante.altura = 1.70f;
        estudiante.peso = 68f;
        estudiante.colorPiel = "Tono moreno oscuro";

        estudiante.mostrarNombreCompleto();

        Persona estudiante2 = new Persona("Justin", "Buendia");
        estudiante2.mostrarNombreCompleto();

        Persona estudiante3 = new Persona(8758923, 1.7f, 68f, "Blanco");
        estudiante3.mostrarDatos();

        estudiante3.nombre = "Justin";
        estudiante3.apellido = "Buendia";
        estudiante3.mostrarNombreCompleto();
    }
}
