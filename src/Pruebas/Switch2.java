package Pruebas;

import java.util.Scanner;

public class Switch2 {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce dia de la semana: ");

        String diaSemana = entrada.nextLine();

        String resultado = switch (diaSemana.toUpperCase()){
            /*case "LUNES" -> "Laborable";
            case "MARTES" -> "Laborable";
            case "MIERCOLES" -> "Laborable";
            case "JUEVES" -> "Laborable";
            case "VIERNES" -> "Laborable";
            case "SABADO" -> "Festivo";
            case "DOMINGO" -> "Festivo";
            default -> "No válido";*/


            //Otra manera
            case "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" -> "LABORABLE";
            case "SABADO", "DOMINGO" -> "FESTIVO";
/*
            default -> "No válido";
*/

            //Otra forma
            default -> {
                System.out.println("Procesando...");
                yield "Dia no válido";
            }
        };

        System.out.println(resultado);
    }
}
