import java.util.Scanner;

public class CondicionalSimple {
    public static void main(String args[]) {
        // Declarando variables
        float temperatura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su temperatura: ");
        temperatura = sc.nextFloat();

        if (temperatura > 38) {
            System.out.print("El paciente tiene fiebre. Consulte a un medico.");
        }
    }
}
