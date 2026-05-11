import java.util.Scanner;

public class Funciones2 {

    static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    static String obtenerMensaje(int nota) {

        if (nota >= 51) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    static void tablaMultiplicar(int numero) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    static int mayor(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double promedio = calcularPromedio(n1, n2, n3);

        System.out.println("Promedio: " + promedio);

        //---------------------------------------------------------//

        String resultado = obtenerMensaje(70);
        System.out.println(resultado);

        //---------------------------------------------------------//
        tablaMultiplicar(5);

        //---------------------------------------------------------//

        System.out.print("Ingrese primer número: ");
        int n4 = sc.nextInt();

        System.out.print("Ingrese segundo número: ");
        int n5 = sc.nextInt();

        int result = mayor(n4, n5);

        System.out.println("El mayor es: " + result);
    }
}
