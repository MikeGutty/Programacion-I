package ExamArreglo;

import java.util.Scanner;

public class Ejercicio2 {
    public static  void main(String args[]) {
        // Declaro mi arreglo
        double[] numeros = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el precio del producto");
            double precio = sc.nextDouble();
            numeros[i] = precio - (precio * 0.15);
            System.out.println("El precio del producto es: " + precio + " y con su descuento es: " + numeros[i]);
        }
    }
}
