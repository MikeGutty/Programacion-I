package Examen;

import java.util.Scanner;

// Genera la tabla de multiplicar del 1 al 10 y cuente resultados pares e impares
public class Ejercicio5 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n =  sc.nextInt();
        int pares = 0, impares = 0;

        for (int i = 1; i <= 10; i++){
            int resultado  = n * i;
            System.out.printf("%d x %2d = %3d%n", n, i, resultado);
            if (resultado % 2 == 0){
               pares++;
            } else  {
                impares++;
            }
        }

        System.out.printf("Resultados pares: %d | Resultados impares: %d%n", pares, impares);
        sc.close();
    }
}
