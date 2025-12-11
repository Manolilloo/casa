package Pruebas;

import javax.swing.*;

public class Hola {
    static void main(String[] args) {
        String nombre;
        String edad;

        nombre = JOptionPane.showInputDialog(null, "Pon tu nombre.");
        edad = JOptionPane.showInputDialog(null, "Pon tu edad.");

        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "Edad: " + edad);
    }
}
