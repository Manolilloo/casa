package YTCursoJava.empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    public Empleado(String nom){

        this(nom ,30000, 2000, 1, 1);


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double porcentaje) {

        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;

        this.sueldo = sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }
}
