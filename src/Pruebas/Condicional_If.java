package Pruebas;

import javax.swing.*;

public class Condicional_If {
    static void main(String[] args) {
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ");
        String edad2 = JOptionPane.showInputDialog(null, "Ingresa tu edad: ");
        edad = Integer.parseInt(edad2);

        //Analizando datos
        if (edad < 12) {
            JOptionPane.showMessageDialog(null, nombre + ", eres un niño(a).");
        } else if (edad > 12 && edad < 19) {
            JOptionPane.showMessageDialog(null, nombre + ", eres adolescente.");
        } else if (edad > 19 && edad < 100) {
            JOptionPane.showMessageDialog(null, nombre + ", eres un adulto.");
        } else if (edad > 100) {
            JOptionPane.showMessageDialog(null, nombre + ", eres un poco viejo ya...");
        }
    }
}
