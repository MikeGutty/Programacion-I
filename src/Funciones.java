public class Funciones {

    static void saludar() {
        System.out.println("Hola estudiantes");
    }

    static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    static int sumar(int a, int b) {
        return a + b;
    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        saludar();
        saludar("Juan");

        int resultado = sumar(5, 3);
        System.out.println("La suma es: " + resultado);

        if (esPar(8)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

}
