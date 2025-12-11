package Pruebas;

import java.util.Scanner;

public class Condicional_Switch {
    static void main(String[] args) {
        int diaSemana;
        Scanner entrada = new Scanner(System.in);

        //ingresando datos
        System.out.println("Ingrese dia a consultar (del 1 al 7)");
        diaSemana= entrada.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero incorrecto, saliendo del sistema...");
                break;
        }
    }
}
