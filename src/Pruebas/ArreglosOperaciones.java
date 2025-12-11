package Pruebas;

public class ArreglosOperaciones {
    static void main(String[] args) {
        int ventas1[] = {100, 200, 300, 400, 500};
        int ventas2[] = {150, 250, 350, 450, 550};
        int total[] = new int[ventas1.length];
        int suma = 0;

        System.out.println("Suma de valores...");
        for (int f = 0; f < ventas1.length; f++) {
            total[f] = ventas1[f] + ventas2[f];
            suma = suma + total[f];
            System.out.println(total[f]);
        }
        System.out.println();
        System.out.println("Suma total: " + suma);

        System.out.println();
        System.out.println("Resta de valores...");
        for (int f = 0; f < ventas1.length; f++) {
            total[f] = ventas2[f] - ventas1[f];
            System.out.println(total[f]);
        }

        System.out.println();

        System.out.println("Multiplicacion de valores...");
        for (int f = 0; f < ventas1.length; f++) {
            total[f] = ventas1[f] * ventas2[f];
            System.out.println(total[f]);
        }
    }
}
