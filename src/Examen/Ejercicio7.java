package Examen;

import java.util.Scanner;

// Menu con 3 figuras geometricas. Calcula areas con validacion de datos positivos
public class Ejercicio7 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("1) Area del circulo ");
       System.out.println("2) Area del triangulo ");
       System.out.println("3) Area del rectangulo ");
       System.out.println("4) Salir");
       System.out.print("Seleccion figura: ");
       int opcion = sc.nextInt();

       switch(opcion){
           case 1:
               System.out.print("Ingrese el radio: ");
               double radio = sc.nextDouble();
               if (radio <= 0 ) {
                   System.out.println("El radio debe de ser positivo.");
                   break;
               }
               System.out.printf("Area del circulo: %.2f%n", Math.PI * radio * radio);
               break;
           case 2:
               System.out.print("Ingrese la base: ");
               double base = sc.nextDouble();
               System.out.print("Ingrese la altura: ");
               double altura = sc.nextDouble();
               if (base <= 0 || altura <= 0) {
                   System.out.println("Los datos debe ser positivos.");
                   break;
               }
               System.out.printf("Area del triangulo: %.2f%n", (base * altura) / 2);
               break;
           case 3:
               System.out.print("Ingrese el largo: ");
               double largo = sc.nextDouble();
               System.out.print("Ingrese el ancho: ");
               double ancho = sc.nextDouble();
               if (largo <= 0 || ancho <= 0) {
                   System.out.println("Los datos debe ser positivos.");
                   break;
               }
               System.out.printf("Area del rectangulo: %.2f%n", largo * ancho);
               break;
           case 4:
               System.out.println("Hasta luego");
               break;
           default:
               System.out.println("Opcion no valida.");
       }
       sc.close();
    }
}
