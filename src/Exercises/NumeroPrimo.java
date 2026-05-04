package Exercises;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int n = sc.nextInt();
        int contador = 0;
        int candidato = 2;

        System.out.print("Primos: ");
        while (candidato <= n) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(candidato); i++) {
                if (candidato % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(candidato + " ");
                contador++;
            }
            candidato++;
        }
        System.out.println();
        System.out.println("Total de primos encontrados: " + contador);
        sc.close();
    }
}
