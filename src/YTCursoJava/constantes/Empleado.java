package YTCursoJava.constantes;

public class Empleado {

    public final String NOMBRE;
    private String seccion;
    private static int idSiquiente = 1;
    private int id;


    public Empleado(String nombre) {
        this.NOMBRE = nombre;
        seccion = "Administración";
        id = idSiquiente;
        idSiquiente++;
    }

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String devuelveDatos() {
        return "El nombre es: " + NOMBRE + " y la sección es: " + seccion + " y el id es: " + id;
    }
}
