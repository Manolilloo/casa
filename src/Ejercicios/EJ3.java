package Ejercicios;

import java.util.Scanner;

public class EJ3 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Introduce 10 numeros: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) positivos++;
            if (numeros[i] < 0) negativos++;
            if (numeros[i] == 0) ceros++;
        }

        System.out.println("Hay "+positivos+" numeros positivos.");
        System.out.println("Hay "+negativos+" numeros negativos.");
        System.out.println("Hay "+ceros+" ceros.");
    }
}
