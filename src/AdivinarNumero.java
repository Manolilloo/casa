import java.util.Scanner;

public class AdivinarNumero {


    //Juego de adivinar numeros aleatorios del 1 al 100

    static void main(String[] args) {

        int numAleat = (int) (Math.random()*100)+1;

        int intentos = 0;

        int numeroUsuario = 0; //Numero que va a introducir el usuario

        Scanner entrada = new Scanner(System.in);

        System.out.println("Tienes que adivinar el numero en 5 intentos, sino, pierdes...");
        System.out.println();
        System.out.println("Introduce un numero del 1 al 100.");
        System.out.println();

        while (numeroUsuario != numAleat){      //Mientras no lo adivine...
            System.out.println("Intentos hasta ahora: "+intentos);  //Se van sumando los intentos que llevas hasta que
                                                                    // lleves 5


            numeroUsuario = entrada.nextInt();

            intentos++;


            //Para ir guiando al user poniendo lo de los intentos para que no salga uno de los dos mensajes cuando
            // aciertes o cuando lleves mas de 5 intentos y aciertes (muy especifico
            // pero puede darse el caso)

            if (numAleat>numeroUsuario && intentos!=5) System.out.println("Mas alto!");
            else if (numAleat<numeroUsuario && intentos!=5) System.out.println("Mas bajo!");

            //Cuando pierdas se ve esto de abajo

            if (intentos == 5 && numAleat!=numeroUsuario){
                System.out.println("Se acabó el juego!\nHasta luego primo...");
                break;
            }

        }

        if (numeroUsuario==numAleat) {      //Esto aparece si ganas el juego adivinando en 5 intentos o menos
            System.out.println();
            System.out.println("Correcto!");
            System.out.println();
            System.out.println("Lo has adivinado en "+intentos+" intentos!");
        }
    }
}
