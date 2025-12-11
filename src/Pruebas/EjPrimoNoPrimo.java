package Pruebas;

import java.util.Scanner;

public class EjPrimoNoPrimo {

    static void main(String[] args) {
        
        int n = leerEnteroPositivoEntre("Mete un numero natural: ", 1, Integer.MAX_VALUE);
        informarSiEsPrimo(n);
    }

    public static void informarSiEsPrimo(int n) {

        if (esPrimo(n)){
            System.out.println("El numero "+ n +" es primo.");
        } else {
            System.out.println("El numero "+ n +" NO es primo.");
        }
    }

    public static boolean esPrimo(int n) {
        int contador = 2;
        int mitad = n / 2;
        while (contador <= mitad && !esMultiplo(n, contador)){
            contador++;
        }
        return contador > mitad;
    }

    public static boolean esMultiplo(int a, int b) {
        return  obtenerResto(a, b) == 0;
    }

    public static int obtenerResto(int a, int b) {
        return a % b;
    }

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
}
