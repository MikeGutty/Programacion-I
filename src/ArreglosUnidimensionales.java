public class ArreglosUnidimensionales {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20};
        int mayor = numeros[0];
        int menor = numeros[0];

        int suma = 0;
        float promedio = 0f;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        promedio = (float) suma / numeros.length;

        System.out.println("La suma es: " + suma);
        System.out.println("La mayor es: " + mayor);
        System.out.println("La menor es: " + menor);
        System.out.println("El promedio es: " + promedio);
    }
}
