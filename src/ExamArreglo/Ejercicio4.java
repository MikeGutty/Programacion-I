package ExamArreglo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
      String[] materias = new String[6];
      int materiasChar = 0;
      Scanner sc = new Scanner(System.in);

      for(int i=0; i<materias.length; i++){
          System.out.println("Ingrese la materia a guardar");
          materias[i] = sc.nextLine();
      }

      System.out.println("* Ingrese una materia a buscar");
      String materiaBuscar = sc.nextLine();

      for(int i=0; i<materias.length; i++){
          if(materias[i].equals(materiaBuscar)){
              System.out.println("La materia existe en la posicion: " + i);
          }

          if(materias[i].length() >= 6){
              materiasChar++;
          }
      }
        System.out.println("Existen " +  materiasChar + " materias con mas de 6 caracteres");
    }
}
