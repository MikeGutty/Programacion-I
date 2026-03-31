import java.util.Scanner;

public class EstructuraSecuencial {
    public static void main(String[] args) {
        // Declarando variables
        float peso, altura, imc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su peso: ");
        peso = sc.nextFloat();

        System.out.print("Ingrese su altura: ");
        altura = sc.nextFloat();

        imc = peso/(altura*altura);

        System.out.println("Su IMC es: " + imc);
        System.out.println("Su  peso es: " + peso + " kg");
        System.out.println("Su altura es: " + altura + " m");
    }
}
