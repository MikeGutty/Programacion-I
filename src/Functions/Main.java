package Functions;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int area, perimetro;

        // Colocando datos
        Triangulo.lado = 5;
        Triangulo.altura = 7;
        Triangulo.base = 3;

        // Calculando area y perimetro
        area = Triangulo.area();
        perimetro = Triangulo.perimetro();

        // Imprimiendo resultados
        System.out.println("El area del triangulo es: " + area);
        System.out.println("El perimetro del triangulo es: " + perimetro);

        // Colocando datos
        Circulo.radio = 15;

        // Calculando datos
        area = Triangulo.area();
        perimetro = Triangulo.perimetro();

        // Imprimiendo datos
        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: " + perimetro);

        // Colocando datos
        Persona.nombre = "Juanelo";
        Persona.edad = 18;
        Persona.CI = 8734675;
        Persona.colorPiel = "azul";

        // Imprimiendo datos
        System.out.println(Persona.saludo());
    }
}
