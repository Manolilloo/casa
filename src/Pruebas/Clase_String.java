package Pruebas;

import java.util.Scanner;

public class Clase_String {
    static void main(String[] args) {
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);

        //ingreso de datos
        System.out.println("Ingrese primera palabra: ");
        palabra1 = entrada.next();
        System.out.println("Ingrese palabra 2: ");
        palabra2 = entrada.next();

        //comparar textos
        if (palabra1.equals(palabra2)) {
            System.out.println("Es igual a la primera primera palabra (" + palabra1 + ")...");
        } else {
            System.out.println("Es diferente a la primera primera palabra (" + palabra1 + ")...");
        }

        //comparar textos sin tomar en cuenta mayusculas

        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println(palabra1 + " es igual a " + palabra2 + "\n" + " sin tomar en cuenta las mayusculas.");
        } else {
            System.out.println(palabra1 + " no es igual a " + palabra2 + "\n" + " sin tomar en cuenta las mayusculas.");
        }

        //comparar cantidad de caracteres

        if (palabra1.compareTo(palabra2) == 0) {
            System.out.println(palabra1 + " tiene las mismas letras que " + palabra2);
        } else {
            if (palabra1.compareTo(palabra2) > 0) {
                System.out.println(palabra1 + " tiene mas letras que " + palabra2);
            } else {
                System.out.println(palabra1 + " tiene menos letras que " + palabra2);
            }

        }
        //saber posicion de un caracter de una palabra
        System.out.println("La segunda letra de " + palabra1 + " es : " + palabra1.charAt(1));

        //cantidad de caracteres de un texto
        System.out.println("Cantidad de caracteres de " + palabra1 + ":" + palabra1.length());
        System.out.println("Cantidad de caracteres de " + palabra2 + ":" + palabra2.length());
        System.out.println("El num de letras de la palabra 1 es: " + palabra1.length() + "\n" + " y el de la palabra 2 es: " + palabra2.length());

        //identificar varios caracteres en un texto o palabra
        System.out.println("Prieras 3 letras de " + palabra1 + ":" + palabra1.substring(0, 3));

        //buscar caracteres que coincidan en otra palabra
        int coincidencia = palabra1.indexOf(palabra2);
        if (coincidencia==-1){
            System.out.println(palabra1+" no tiene coincidencias de texto con "+palabra2);
        } else{
            System.out.println(palabra1+" tiene coincidencias de texto con "+palabra2);
        }
        //llevar a mayusculas
        System.out.println(palabra1+ " en mayusculas es: "+ palabra1.toUpperCase());

        //llevar a minusculas
        System.out.println(palabra1+ " en minusculas es: "+ palabra1.toLowerCase());
    }
}
