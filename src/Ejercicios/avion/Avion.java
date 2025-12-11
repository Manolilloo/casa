package Ejercicios.avion;

public class Avion {

    private String marca;
    private String modelo;
    private int consumo; // litros consumidos por km
    private Deposito deposito;
    private Registro[] registros;

    public Avion(String marca, String modelo, int consumo, Deposito deposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.deposito = deposito;
        this.registros = new Registro[5];
    }

    private int indiceUltimaRevision() throws AvionException {

        for (int i = registros.length - 1 ; i >= 0; i--) {
            if (registros[i]!=null){
                return i;
            }
        }
        throw new AvionException("No se encontro ninguna revision");
    }

    public void añadirRegistro(Registro registro) throws AvionException {
        for (int i = 0; i < registros.length; i++) {
            if (registros[i]==null){
                registros[i] = registro;
                return;
            }
        }
        throw new AvionException("No hay espacio para mas revisiones");
    }

    public boolean puedeVolar(double distancia){
        if (!estalisto()||distancia*consumo > deposito.getCapacidadActual()||distancia<0){
            return false;
        }
        return true;
    }


    private boolean estalisto() {
        try {
            return registros[indiceUltimaRevision()].isEstado();
        } catch (AvionException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", deposito=" + deposito +
                ", es valido?" + estalisto() +
                '}';
    }
}
