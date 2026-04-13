import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // Definir variables
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        numero = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
