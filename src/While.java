import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // Declarando varialbes
        int intentos = 0;
        String clave;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la clave: ");
        clave = sc.nextLine();

        while (!clave.equals("secreto123") && intentos < 2) {
            System.out.println("Clave incorrecta. Intente de nuevo: ");
            clave = sc.nextLine();
            intentos = intentos + 1;
        }

        if (clave.equals("secreto123")) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Cuenta bloqueada.");
        }
    }
}
