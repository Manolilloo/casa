package Pruebas;

public class Bucle_For {
    static void main(String[] args) {

        /*//bucle ascendente
        System.out.println("bucle ascendente");
        for (int f = 0; f <= 10; f++) {
            System.out.println("Vuelta no... " + f);
        }
        System.out.println("Fin del bucle.");
        System.out.println();

        //bucle descendente
        System.out.println("bucle descendente");
        for (int f = 10; f >= 0; f--) {
            System.out.println("Vuelta no... " + f);
        }
        System.out.println();
        System.out.println("Fin del bucle.");*/

        int suma = 0;
        System.out.println("Sumando valores del 0 al 20... ");
        for (int f = 0; f <= 20; f++) {
            if (f % 2 == 0) {
                suma += f;
                System.out.println();
                System.out.println("Valor actual: " + f);
                System.out.println();
            }

        }
        System.out.println("Fin de la operacion.");
        System.out.println("Suma de pares: " + suma);

    }
}
