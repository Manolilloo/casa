import java.util.Scanner;

public class PesoIDeal {

    static void main(String[] args) {
        String genero = "";
        Scanner entrada = new Scanner(System.in);


        //Esto es para que el usuario me ponga si es hombre o mujer.
        do {

            System.out.println("Introduce tu genero: (H/M)");

            genero = entrada.nextLine();

        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        int altura = 0;

        System.out.println("Introduce tu altura en cm: ");
        altura = entrada.nextInt();
        int pesoIdeal = 0;

        if (genero.equalsIgnoreCase("H")){

            pesoIdeal = altura - 110;
        } else if (genero.equalsIgnoreCase("M")){

            pesoIdeal = altura - 120;
        }

        System.out.println("Tu peso ideal serían unos "+ pesoIdeal+"kg.");
    }

}
