import java.util.Scanner;

public class Bucle_While {
    static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        //bucle while
        /*while (f < 5){
            System.out.println(f);
            if (f==3){
                System.out.println("Soy la vuelta 3");
            }
            f++;

        }*/
        int f = 0;
        //tabla de multiplicar
        /*int valor;


        System.out.println("Ingrese un numero para mostrar su tabla de multiplicar");
        valor = entrada.nextInt();

        while (f<=10){
            System.out.println(valor+"x"+f+"="+valor*f+"\n");
            f++;
        }
        System.out.println("Fin del bucle.");*/

        //control de usuario
        final String username = "hsimpson";
        final String password = "abc123";
        boolean acceso = false;

        while (!acceso) {
            System.out.println("Ingrese su usuario: ");
            String usuario = entrada.next();
            System.out.println("Ingrese su contraseña: ");
            String clave = entrada.next();

            if (username.equals(usuario) && password.equals(clave)){
                System.out.println("\n"+"ACCESO CORRECTO"+"\n"+"BIENVENIDO AL SISTEMA"+"\n");
                acceso = true;
            }else {
                System.out.println("\n"+"USUARIO O CONTRASEÑA INCORRECTA, INTENTELO DE NUEVO");
                acceso = false;
            }

        }
        System.out.println("Fin del bucle.");


    }
}
