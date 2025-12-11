package Pruebas;

public class Casting {
    static void main(String[] args) {

        String numeroTexto = "123";
        int numeroEntero = Integer.parseInt(numeroTexto);

        System.out.println("Numero entero: " + numeroTexto);

        int nument = 234;
        String entext = String.valueOf(nument);
        System.out.println("Texto: " + entext);

        double numeroDoble = 45.5;
        int aloha = (int) numeroDoble;
        System.out.println("De doble a entero: " + aloha);

        int edad = 12;
        double edasd = (double) edad;
        System.out.println(edasd);

    }
}
