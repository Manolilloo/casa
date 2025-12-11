package Pruebas;

import java.util.Scanner;

public class Metodo_Nextline {
    static void main(String[] args) {
        String texto1, texto2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese texto 1...");
        texto1= entrada.nextLine();
        System.out.println("Ingrese texto 2...");
        texto2= entrada.nextLine();

        System.out.println(texto1);
        System.out.println(texto2);
    }
}
