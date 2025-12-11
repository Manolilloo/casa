package Pruebas;

import java.util.Scanner;

public class CondIF {

    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");

        int edad = entrada.nextInt();

        if (edad > 100){
            System.out.println("Vaya locura lo lejos que has llegado en\n esta vida, felicidades tio!");
        } else if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
