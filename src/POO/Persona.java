package POO;

public class Persona {
    // Atributos
    String nombre;
    String apellido;
    int CI;
    float altura;
    float peso;
    String colorPiel;

    // Constructor
    Persona() {}

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    Persona(int CI, float altura, float peso, String colorPiel) {
        this.CI = CI;
        this.altura = altura;
        this.peso = peso;
        this.colorPiel = colorPiel;
    }

    // Metodos
    void mostrarNombreCompleto() {
        System.out.println("Mi nombre completo es: " + this.nombre + " " + this.apellido);
    }

    void mostrarDatos() {
        System.out.println("Mi CI es: " + this.CI);
        System.out.println("Mi altura es: " + this.altura);
        System.out.println("Mi peso es: " + this.peso);
        System.out.println("Mi color piel es: " + this.colorPiel);
    }
}
