package POO;

public class Triangulo {
    // Atributos
    int lado;
    int base;
    int altura;

    // Metodos o funciones
    int perimetro() {
        int res = 3 * this.lado;
        return res;
    }

    int area() {
        int res = (this.base * this.altura)/2;
        return res;
    }
}
