package Examen;

import java.util.Scanner;

// Calcula el IMC (peso / altura²) y clasifica el resultado. Valida datos negativos o cero
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese altura (m): ");
        double altura = sc.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Error: los datos deben ser mayores a cero.");
        } else {
            double imc = peso/(altura*altura);
            String clasificacion;

            if (imc < 18.5) {
                clasificacion = "Bajo peso";
            } else if (imc < 25) {
                clasificacion = "Normal";
            } else if (imc < 30) {
                clasificacion = "Sobrepeso";
            } else {
                clasificacion = "Sobrepeso";
            }

            System.out.printf("IMC: %.2f -> Clasificacion: %s%n", imc, clasificacion);
        }
    }
}
