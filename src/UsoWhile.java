import javax.swing.*;

public class UsoWhile {

    static void main(String[] args) {

        //Esto es pa comprobar si una contraseña es correcta o no mediante bucle while.

        String clave = "Lunes";
                                    //Pongo la clave pa entrar y pongo una pass que es la que vas a introducir.
        String pass = "asdasdasdas";

        while (clave.equals(pass) == false) {

            pass = JOptionPane.showInputDialog("Introduce contraseña: "); //Aqui escribes la contra.

            if (clave.equals(pass) == false) System.out.println("Contraseña incorrecta.");

        }

        //Hasta que no pongas que la contra es exactamente "Lunes" no te pone eso.
        System.out.println("Acceso correcto.");

    }
}
