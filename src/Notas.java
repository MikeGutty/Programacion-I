import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        // Declarando variables
        String nombre, calificacion;
        float nota1, nota2, nota3, nota4, nota5, promedio;
        int menu;
        // float[] notas = new float[5];
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();

        System.out.print("Ingrese su nota 1 (0 - 100): ");
        nota1 = input.nextFloat();

        System.out.print("Ingrese su nota 2 (0 - 100): ");
        nota2 = input.nextFloat();

        System.out.print("Ingrese su nota 3: (0 - 100): ");
        nota3 = input.nextFloat();

        System.out.print("Ingrese su nota 4: (0 - 100): ");
        nota4 = input.nextFloat();

        System.out.print("Ingrese su nota 5: (0 - 100): ");
        nota5 = input.nextFloat();

        promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5;

        if (promedio >= 90) {
            calificacion = "(A)";
        } else if (promedio >= 80) {
            calificacion = "(B)";
        } else if (promedio >= 70) {
            calificacion = "(C)";
        } else if (promedio >= 60) {
            calificacion = "(D)";
        } else if (promedio >= 50) {
            calificacion = "(E)";
        } else {
            calificacion = "(F)";
        }

        System.out.println("Seleccione una opcion del menu");
        System.out.println("1. Mostrar mensaje personalizado");
        System.out.println("2. Mostrar si aprobo o no");
        System.out.println("3. Mostrar lista de notas");
        System.out.println("4. Salir");

        menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Felicidades " + nombre + " ,obtuviste " + calificacion);
                break;
            case 2:
                if (promedio >= 61) {
                    System.out.println("Felicidades, aprobaste");
                } else {
                    System.out.println("Malas noticias, no aprobaste");
                }
                break;
            case 3:
                System.out.println("Tu nota 1 es: " + nota1);
                System.out.println("Tu nota 2 es: " + nota2);
                System.out.println("Tu nota 3 es: " + nota3);
                System.out.println("Tu nota 4 es: " + nota4);
                System.out.println("Tu nota 5 es: " + nota5);
                break;
            case 4:
                System.out.println("Hasta luego");
                break;
        }
    }
}
