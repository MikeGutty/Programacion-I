package Examen;

import java.util.Scanner;

// Menu con opciones par/impar, factorial y salir. Se repite con do-while hasta elegir opcion 3.
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Par/Impar");
            System.out.println("2. Factorial");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese un numero: ");
                int num  = sc.nextInt();
                if (num % 2 == 0) {
                    System.out.println(num + " es PAR.");
                } else {
                    System.out.println(num + " es IMPAR");
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese un numero: ");
                int num  = sc.nextInt();
                if (num < 0) {
                    System.out.println("El numero debe se ser >= 0.");
                } else {
                    long factorial = 1;
                    for (int i = 1; i <= num; i++) {
                        factorial = factorial * i;
                    }
                    System.out.println("Factorial de " + num + " = " +factorial);
                }

            } else if (opcion == 3) {
                System.out.print("Hasta luego.");
            } else {
                System.out.println("Opcion no valida.");
            }

        } while(opcion != 3);
        sc.close();
    }
}
