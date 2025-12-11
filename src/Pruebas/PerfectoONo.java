package Pruebas;

import java.util.Scanner;

public class PerfectoONo {

    public static void main(String[] args) {

        int n = leerEnteroPositivoEntre("Mete un numero perfecto", 1, Integer.MAX_VALUE);
        informarSiEsPerfecto(n);

    }

    public static void informarSiEsPerfecto(int n) {

        if (esPerfecto(n)){
            System.out.println("El numero "+ n +" es perfecto.");
        } else {
            System.out.println("El numero "+ n +" NO es perfecto.");
        }
    }

    public static boolean esPerfecto(int n) {
     return sumatoriaDeDivisoresPropios(n) == n;
    }

    public static int sumatoriaDeDivisoresPropios(int n) {

        int sumatoria = 0;
        int mitad = n / 2;
        for (int i = 1; i <= mitad; i++) {
            if (esMultiplo(n, i)){
                sumatoria+= i;
            }
        }

        return sumatoria;
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
