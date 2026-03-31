import java.util.Scanner;

public class CondicionalDoble {
    public static void main(String[] args){
        // Declarando variables
        float nota;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        nota = sc.nextFloat();

        if (nota >= 51){
            System.out.print("APROBADO con nota: " + nota);
        } else {
            System.out.print("REPROBADO con nota: " + nota);
        }
    }
}
