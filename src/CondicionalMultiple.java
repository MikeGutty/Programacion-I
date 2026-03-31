import java.util.Scanner;

public class CondicionalMultiple {
    public static void main(String[] args) {
        // Declarando variables
        int nota, diaSemana;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        nota = input.nextInt();

        // If anidado (rango de notas)
        if (nota >= 90) {
            System.out.println("Excelente (A) ");
        } else if (nota >= 80) {
            System.out.println("Muy Bueno (B) ");
        } else if (nota >= 70) {
            System.out.println("Bueno (C)");
        } else if (nota >= 51) {
            System.out.println("Suficiente (D) ");
        }  else {
            System.out.println("Reprobado (F)");
        }

        System.out.print("Ingrese dia de semana: ");
        diaSemana = input.nextInt();

        // Switch (valor exacto)
        switch (diaSemana) {
            case 1:
                System.out.print("Lunes");
                break;
            case 2:
                System.out.print("Martes");
                break;
            case 3:
                System.out.print("Miercoles");
                break;
            case 4:
                System.out.print("Jueves");
                break;
            case 5:
                System.out.print("Viernes");
                break;
        }
    }
}
