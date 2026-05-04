package Exercises;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese N (1-9): ");
        int n = sc.nextInt();

        if (n < 1 || n > 9) {
            System.out.println("N debe de estar entre 1 e 9");
        } else {
            for (int fila = 1; fila <= n; fila++) {
                // Espacios de relleno para centrar
                for (int esp = 0; esp < (n-fila); esp++) {
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
                System.out.println("N = " + n + " es un numero par.");
            } else {
                System.out.println("N = " + n + " es un numero impar.");
            }
        }
    }
}
