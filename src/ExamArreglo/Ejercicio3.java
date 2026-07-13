package ExamArreglo;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] datos = {5, 18, -7, 42, -3, 11, -20, 30};
        int countNegativos = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<datos.length; i++){
            if(datos[i]<0){
                countNegativos++;
                datos[i] = -datos[i];
            }
        }

        System.out.println("Escoja una posicion entre 0 y 7");
        int posicion = sc.nextInt();
        datos[posicion] = 99;

        System.out.println("Existen " + countNegativos + " valores negativos");

        // Foreach
        for(int dato: datos){
            System.out.print(dato + ", ");
        }
    }
}
