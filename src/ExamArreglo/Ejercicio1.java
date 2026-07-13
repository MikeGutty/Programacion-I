package ExamArreglo;

public class Ejercicio1 {

    // Declarar mi arreglo
    static final int[] numeros = new int[7];

    public static void main(String args[]) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i*i;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El valor del numero en la posicion " + i + " es: " + numeros[i]);
        }
    }
}
