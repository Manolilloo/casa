import java.util.Scanner;

public class EntradaDatos {

    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre porfa: ");

        String nombre = entrada.nextLine();

        System.out.println("Hola, "+ nombre+".");

        System.out.println("Ahora tu edad: ");

        int edad = entrada.nextInt();

        System.out.println("Puerquita, tienes "+ edad+ " años.");

        entrada.close();
    }


}
