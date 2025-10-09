import javax.swing.*;

public class Input_datos_2 {
    static void main(String[] args) {
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre..");
        String edad2 = JOptionPane.showInputDialog(null, "Ingresa edad..");
        edad = Integer.parseInt(edad2);

        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+"\n"+"Edad: "+edad);
    }
}