import java.util.Scanner;

public class Operadores_Aritmeticos {
    static void main(String[] args) {
        int v1, v2, resultado;

        //Operador suma
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer valor: ");
        v1 = entrada.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        v2 = entrada.nextInt();;

        resultado = v1 + v2;
        System.out.println("suma: "+resultado);

        resultado = v1 - v2;
        System.out.println("Resta: "+resultado);

    }
}
