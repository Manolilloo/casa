import java.util.Scanner;

public class Factorial {

    static void main(String[] args) {

        System.out.println("Vamos a calcular el factorial de un num");
        System.out.println("Dime un numero: ");

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        long resultado = 1;

        for (int i = numero; i > 0; i--) {

            resultado *= i;
        }

        System.out.println("El resultado de " + numero + " es: " + resultado);
    }
}
