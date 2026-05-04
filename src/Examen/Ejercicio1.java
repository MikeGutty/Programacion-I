package Examen;

import java.util.Scanner;

// Nota del 0 al 100
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        int nota = sc.nextInt();

        String calificacion;
        if (nota >= 90 && nota <= 100){
            calificacion = "Excelente";
        } else if (nota >= 70){
            calificacion = "Bueno";
        } else if (nota >= 50){
            calificacion = "Regular";
        } else if (nota >= 0){
            calificacion = "Reprobado";
        } else {
            calificacion = "Nota invalida";
        }

        System.out.println("Calificacion: " + calificacion);
        sc.close();
    }
}
