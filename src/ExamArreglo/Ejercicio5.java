package ExamArreglo;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo1 = new int[5];
        int[] arreglo2 = new int[5];
        int[] arreglo3 = new int[5];
        int suma = 0;

        for(int i=0; i<arreglo1.length; i++){
            System.out.println("Ingrese el valor para el primer arreglo: ");
            arreglo1[i] = sc.nextInt();

            System.out.println("Ingrese el valor para el segundo arreglo: ");
            arreglo2[i] = sc.nextInt();
        }

        for(int i=0; i<arreglo3.length; i++){
            arreglo3[i] = arreglo1[i] + arreglo2[i];
            suma += arreglo3[i];
        }

        for(int dato: arreglo1){
            System.out.print(dato + ", ");
        }

        for(int dato: arreglo2){
            System.out.print(dato + ", ");
        }

        for(int dato: arreglo3){
            System.out.print(dato + ", ");
        }

        System.out.println("La suma total del arreglo resultado es: " + suma);
    }
}
