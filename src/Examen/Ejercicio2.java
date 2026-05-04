package Examen;

import java.util.Scanner;

// Lee dos enteros y un operador. Usa switch para calcular el resultado
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Ingrese operador (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println("Resultado: " + num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Operador invalido");
        }
        sc.close();
    }
}
