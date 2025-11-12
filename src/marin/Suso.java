package marin;

import java.util.Scanner;

public class Suso {

    public static int leerEnteroPositivoEntre(String mensaje, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje+" : ");
        int numero = sc.nextInt();

        while (numero < min || numero > max){
            System.out.println("ERROR." +mensaje+" : ");
            numero = sc.nextInt();
        }
        return numero;
    }
    public static boolean esMultiplo(int a, int b) {
        return  obtenerResto(a, b) == 0;
    }
    public static int obtenerResto(int a, int b) {
        return a % b;
    }
    public static boolean esPrimo(int n) {
        int contador = 2;
        int mitad = n / 2;
        while (contador <= mitad && !esMultiplo(n, contador)){
            contador++;
        }
        return contador > mitad;
    }
    public static String sucesionSimbolos(char simbolo, int veces) {
        String sucesion = "";
        for (int i = 0; i < veces; i++) {
            sucesion += simbolo;
        }

        return sucesion;
    }
    public static void imprimirSimbolo(char simbolo, int veces) {
        System.out.println(sucesionSimbolos(simbolo, veces));
    }
}
