package Exercises;

import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CLAVE = "Java2024";
        String intento;
        int intentos = 0;

        do {
            System.out.print("Ingrese la contrasena: ");
            intento = sc.nextLine();
            intentos++;
        } while (!intento.equals("Java2024"));
        System.out.println("La contrasena es: " + intentos);
        sc.close();
    }
}
