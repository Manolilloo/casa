package Ejercicios.avion;

public class Deposito {

    private final double CAPACIDAD_MAX;
    private double capacidadActual;

    public Deposito(double capacidadMax, double capacidadActual) throws AvionException{
        if (capacidadMax <= 0) throw new AvionException("La capacidad no puede ser 0 o menor");
        this.CAPACIDAD_MAX = capacidadMax;
        setCapacidadActual(capacidadActual);
    }

    public double getCAPACIDAD_MAX() {
        return CAPACIDAD_MAX;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    private void setCapacidadActual(double capacidadActual) throws AvionException{
        if (capacidadActual < 0) throw new AvionException("La cantidad actual no puede ser negativa");
        if (capacidadActual> CAPACIDAD_MAX) throw new AvionException("La capacidad actual no puede superar a la maxima");
        this.capacidadActual = capacidadActual;
    }
}
