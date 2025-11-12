package Ejercicios;

import java.util.Scanner;

public class EJ2 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];

        System.out.println("Introduce 5 notas de examenes: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];

            suma += notas[i];
        }

        System.out.println("Nota maxima: "+ max);
        System.out.println("Nota minima: "+ min);
        System.out.println("Nota media: "+ (suma / notas.length));

    }
}
