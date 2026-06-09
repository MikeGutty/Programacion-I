package Exercises;

import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int sumatoria = 0;
        int promedio = 0;
        int maximo = 0;
        int minimo = 0;
        int numeroBusqueda = 0;
        boolean bandera = false;

        // Sirve para guardar los datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }

        // Sirve para imprimir los valores de mi arreglo
        for (int i = 0; i < numeros.length; i++) {
            // System.out.print(numeros[i] + ",");
            System.out.println("En el indice " + i + ": " + numeros[i]);
        }

        // Calculos
        maximo = numeros[0];
        minimo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            // Numero maximo
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            // Numero minimo
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
            sumatoria = sumatoria + numeros[i];
            // sumatoria += numeros[i];
        }
        promedio = sumatoria / numeros.length;

        // Impresion de nuestros calculos
        System.out.println("La sumatoria es: " + sumatoria);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El maximo es: " + maximo + " y el minimo es: " + minimo);

        // Comparar si existe o no el numero
        System.out.print("Ingrese el numero a buscar: ");
        numeroBusqueda = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBusqueda) {
                bandera = true;
                break;
            }
        }

        if (bandera) {
            System.out.println("El numero existe en el arreglo");
        } else {
            System.out.println("El numero no existe en el arreglo");
        }

    }
}
