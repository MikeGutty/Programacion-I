package Examen;

import java.util.Scanner;

// Genera una piramide numerica centrada usando for anidados e indica si N es par o impar
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N (1-9): ");
        int n = sc.nextInt();

        if (n < 1 || n >9) {
            System.out.print("N debe estar entre 1 y 9.");
        } else {
            for (int fila = 1; fila <= n; fila++) {
               // Espacios de relleno para centrar
               for (int esp = 0; esp < (n - fila); esp++) {
                  System.out.print(" ");
               }
               // Numeros de la fila
                for (int num = 1; num <= fila; num++) {
                   System.out.print(num + " ");
                }
                System.out.println();
            }
            // Par o impar
            if (n % 2 == 0) {
                System.out.print("N = " + n + " es un numero par.");
            } else {
                System.out.print("N = " + n + " es un numero impar.");
            }
        }
        sc.close();
    }
}
