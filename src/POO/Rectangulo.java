package POO;

public class Rectangulo {
    // Atributos
    int lado;
    int base;
    int altura;

    // Metodos
    int perimetro() {
        int res = (this.base * 2) + (this.altura * 2);
        return res;
    }

    int area() {
        int res = (this.base * this.altura);
        return res;
    }
}
