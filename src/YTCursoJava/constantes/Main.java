package YTCursoJava.constantes;

public class Main {
    static void main(String[] args) {

        Empleado empleado1 = new Empleado("Paco");
        Empleado empleado2 = new Empleado("Ana");
        Empleado empleado3 = new Empleado("María");

        empleado1.cambiaSeccion("RRHH");

        System.out.println(empleado1.devuelveDatos());
        System.out.println(empleado2.devuelveDatos());
        System.out.println(empleado3.devuelveDatos());
    }



}
