import java.util.Scanner;

public class DoWhile {
    public static  void main(String args[]) {
        // Declarando variables
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");

            System.out.println("Ingrese una opcion");
            opcion = sc.nextInt();
        } while (opcion != 4);
    }
}
