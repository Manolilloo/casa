package Pruebas;

public class TablaMultiplicar {

    static void main(String[] args) {

        int resultado = 0;


        for (int i = 1; i <= 10; i++) {

            System.out.println("Tabla del " + i + " : ");

            for (int j = 0; j <= 10; j++) {

                resultado = i * j;

                System.out.println(i + " * " + j + " = " + resultado);

            }

        }
    }
}
