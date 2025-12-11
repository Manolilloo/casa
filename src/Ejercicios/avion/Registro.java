package Ejercicios.avion;

import java.time.LocalDate;
import java.time.Period;

public class Registro {

    private LocalDate fecha;
    private boolean estado; //true para correcto y false para incorrecto
    private Period periodoValidez;

    public Registro(LocalDate fecha, Period periodoValidez) {
        this.fecha = fecha;
        this.periodoValidez = periodoValidez;
        estaListo();
    }

    public void estaListo(){
        estado = !fecha.plus(periodoValidez).isBefore(LocalDate.now());
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public Period getPeriodoValidez() {
        return periodoValidez;
    }
}
