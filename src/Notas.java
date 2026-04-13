import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        // Declarando variables
        String nombre, calificacion;
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0, sumaNotas = 0, promedio;
        int opcion;
        // float[] notas = new float[5];
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese su nota"  + i + "(0 - 100): ");
            float nota = input.nextFloat();
            switch (i) {
                case 1:
                    nota1 = nota;
                    break;
                case 2:
                    nota2 = nota;
                    break;
                case 3:
                    nota3 = nota;
                    break;
                case 4:
                    nota4 = nota;
                    break;
                case 5:
                    nota5 = nota;
                    break;
            }
            sumaNotas += nota;
        }
        promedio = sumaNotas/5;

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

        do {

            System.out.println("Seleccione una opcion del menu");
            System.out.println("1. Mostrar mensaje personalizado");
            System.out.println("2. Mostrar si aprobo o no");
            System.out.println("3. Mostrar lista de notas");
            System.out.println("4. Salir");

            opcion = input.nextInt();

            switch (opcion) {
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
                default:
                    System.out.println("Escoja una opcion correcta");
                    break;
            }
        } while (opcion != 4);
    }
}
