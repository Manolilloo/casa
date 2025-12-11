package Pruebas;

import java.util.Scanner;

public class ArreglosMayorValor {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];
        int mayor = 0;

        //llenando array
        for (int f = 0; f < 5; f++) {

            System.out.println("Ingrese valor: "+f);
            numeros[f] = entrada.nextInt();

            //analizando el mayor valor
            if (numeros[f] > mayor) {
                mayor = numeros[f];
            }

        }
        System.out.println("Mayor valor ingresado es: " + mayor);
    }
}
