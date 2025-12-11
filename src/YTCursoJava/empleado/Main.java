package YTCursoJava.empleado;

public class Main {
    static void main(String[] args) {


        /*Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        Empleado empleado2 = new Empleado("María Pérez", 85000, 1995, 6, 2);
        Empleado empleado3 = new Empleado("Juan Fernández", 85000, 2002, 3, 15);

        empleado1.setSueldo(5);
        empleado2.setSueldo(5);
        empleado3.setSueldo(5);

        System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() + " Fecha de " +
                "alta en la empresa: " + empleado1.getAltaContrato());
        System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo() + " Fecha de " +
                "alta en la empresa: " + empleado2.getAltaContrato());
        System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() + " Fecha de " +
                "alta en la empresa: " + empleado3.getAltaContrato());*/


        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        empleados[1] = new Empleado("María Pérez", 23874, 1995, 6, 2);
        empleados[2] = new Empleado("Juan Fernández", 87123, 2002, 3, 15);
        empleados[3]=new Empleado("Antonio Fernández");


        for (Empleado empleado : empleados) {
            empleado.setSueldo(5); //porcentaje de subida de sueldo
            System.out.println("Sueldo de " + empleado.getNombre() + ": " + empleado.getSueldo() + "€");
        }
        System.out.println("Nombre: " + empleados[3].getNombre() + " Sueldo: " + empleados[3].getSueldo() + " Fecha de " +
                "alta en la empresa: " + empleados[3].getAltaContrato());
    }
}
