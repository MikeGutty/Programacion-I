package Functions;

public class Circulo {
   // Atributos
   static double radio;

   // Funciones
   static double area() {
       double resultado = Math.PI * radio * radio;
       return resultado;
   }

   static double perimetro() {
       double resultado = 2 * Math.PI * radio;
       return resultado;
   }
}
