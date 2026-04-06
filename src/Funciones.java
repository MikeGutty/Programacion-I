public class Funciones {

    public static void main(String[] args) {
        int numero;
        System.out.println("Programa principal");
        // saludar();
        numero = sumar();
        System.out.println("El resultado es: " + numero);
    }

    public static void saludar(){
        System.out.println("Hola, como estas?");
    }

    public static int sumar(){
        int suma = 0;
        suma = suma + 10;
        return suma;
    }

}
