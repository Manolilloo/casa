import javax.swing.*;

public class Bucles_Ejercicios {
    static void main(String[] args) {
        final String uCorrecto = "Usuario01";
        final String pCorrecto = "Abc123%";

        String username, password;
        int intentos = 0;
        final int maxIntentos = 3;

        while (intentos < maxIntentos) {
            username = JOptionPane.showInputDialog(null, "Ingrese su usuario:");
            password = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");

            if (username.equals(uCorrecto) && password.equals(pCorrecto)) {
                JOptionPane.showMessageDialog(null, "ACCESO CORRECTO\nBIENVENIDO AL SISTEMA, " + uCorrecto);
                break;

            } else {
                intentos++;
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA, INTENTELO DE NUEVO");
            }
            if (intentos == 3) {
                JOptionPane.showMessageDialog(null, "HA SUPERADO EL NUMERO MAXIMO DE INTENTOS, SU CUENTA HA SIDO BLOQUEADA");
                break;
            }
        }
    }
}
