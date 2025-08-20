package Expresion;

public class Expresiones {
    public static void main(String[] args) {
        /*
         * Evaluar la siguiente expresion para A=2 y B=5 :
         * 3*A - 4*B / A^2
         */

         int a = 2;
         int b = 5;

         double resultado = 3 * a - (4.0 * b / Math.pow(a, 2));
         System.out.println("El resultado es: " + resultado);
    }
    
}
