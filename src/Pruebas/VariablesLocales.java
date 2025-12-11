package Pruebas;

public class VariablesLocales {

    static void main(String[] args) {
        System.out.println("El factorial de 4 es: "+ factorial(4));

    }
    public static int factorial ( int a){
        int resultado = 1;

        for (int i = a; i > 0; i--) {
            resultado *= i;

        }
        return resultado;
    }
}
