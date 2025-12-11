package Pruebas;

public class UsoArrays2 {

    static void main(String[] args) {

        /*String[] paises = new String[9];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {

            System.out.println("Introduce un país: ");
            paises[i] = entrada.nextLine();

        }

        for (String elemento : paises) System.out.println("Pais: " + elemento);*/


        int[] arrayAleatorio = new int[200];

        for (int i = 0; i < arrayAleatorio.length; i++) {

            arrayAleatorio[i] = (int) (Math.round(Math.random() * 100));

        }

        for (int elemento : arrayAleatorio) {
            System.out.print(elemento + " ");
        }


    }
}

