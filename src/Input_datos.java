import java.util.Scanner;

public class Input_datos {
    static void main(String[] args) {
        String nombre;
        int edad;

        //ingreso de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre...");
        nombre = entrada.next();
        System.out.println("escribe tu edad");
        edad = entrada.nextInt();

        //salida de datos
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
    }
}
