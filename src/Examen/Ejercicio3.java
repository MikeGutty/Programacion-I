package Examen;

import java.util.Scanner;

// Acumula numeros hasta que el usuario ingrese 0, luego muestra suma y promedio
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, cantidad = 0, numero;

        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;
            cantidad++;
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = sc.nextInt();
        }

        if (cantidad == 0) {
            System.out.println("No ingreso ningun numero");
        } else {
            double promedio = (double) suma / cantidad;
            System.out.printf("Suma total: %d | Promedio: %.2f\n", suma, promedio);
        }
        sc.close();
    }
}
