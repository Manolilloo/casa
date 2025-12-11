package Pruebas;

public class FuncionesIntro {

    static void main(String[] args) {

        /*System.out.println(obtenerResto(20, 3));
        System.out.println(esMultiplo(6, 3));*/


        imprimirSimbolo('x', 5);
        imprimirSimbolo('#', 3);
        imprimirSimbolo('€', 1);

        String s = sucesionSimbolos('~', 7);
        System.out.println(s);
    }

    /*private static int obtenerResto(int a, int b) {

        return a % b;
    }

    private static boolean esMultiplo(int a, int b) {
        return obtenerResto(a, b) == 0;
    }*/


    public static void imprimirSimbolo(char simbolo, int veces) {
        System.out.println(sucesionSimbolos(simbolo, veces));
    }

    public static String sucesionSimbolos(char simbolo, int veces) {
        String sucesion = "";
        for (int i = 0; i < veces; i++) {
            sucesion += simbolo;
        }

        return sucesion;
    }
}
