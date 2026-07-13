package Functions;

public class Triangulo {
    // Atributos
    static int lado;
    static int altura;
    static int base;

    // Funciones
    static int area() {
        int resultado = (base * altura)/2;
        return resultado;
    }

    static int perimetro() {
        int resultado = (lado + lado + lado);
        return resultado;
    }
}
