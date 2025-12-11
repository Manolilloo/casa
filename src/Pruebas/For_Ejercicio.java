package Pruebas;

import javax.swing.*;

public class For_Ejercicio {
    static void main(String[] args) {

        boolean validar = true;

        for (int f = 0; validar; f++) {
            String email = JOptionPane.showInputDialog(null, "Ingrese su correo electrónico:");


            if (!email.contains("@") && (!email.contains(".com") || !email.contains(".es"))) {
                JOptionPane.showMessageDialog(null, "Bro, no pusiste ni @ ni .com o .es, vuelve a intentarlo.");

            } else {
                JOptionPane.showMessageDialog(null, "Correo electrónico válido. Gracias.");
                validar = false;
                break;
            }

        }
        System.out.println("Fin del proceso.");

    }
}
