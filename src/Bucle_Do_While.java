import java.util.Scanner;

public class Bucle_Do_While {
    static void main(String[] args) {
        int contador = 1;
        final var valor = 5;

        //bucle do while
        /*do {
            System.out.println("Valor: " + contador++);
        }while (contador<=valor);
        System.out.println("Fin del bucle.");*/

        Scanner entrada = new Scanner(System.in);

        //ejercicio con do while

        int numero = 0;
        int errores = 0;

        do {
            System.out.println("Ingrese el numero 5: ");
            numero = entrada.nextInt();

            if (numero != 5) {
                System.out.println("El numero ingresado no es 5, intente de nuevo");
                errores++;
            }

        } while (numero != 5);
        System.out.println("Gracias.");
        System.out.println("Me cago en ti, has tenido " + errores + " errores.");
    }
}
