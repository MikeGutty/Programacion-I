package Examen;

import java.util.Scanner;

// Solicita la contraseña hasta acertar y cuenta los intentos
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CLAVE = "Java2024";
        String intento;
        int intentos = 0;

        do {
            System.out.print("Ingrese la contraseña: ");
            intento = sc.next();
            intentos++;
            if (!intento.equals(CLAVE)) {
                System.out.println("Contraseña incorrecta. Intente de nuevo.");
            }
        } while (!intento.equals(CLAVE));

        System.out.println("Acceso concedido. Intentos realizados: " + intentos);
        sc.close();
    }
}
