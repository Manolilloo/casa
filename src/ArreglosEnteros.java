public class ArreglosEnteros {
    static void main(String[] args) {
        //declaracion de un array
        int[] numeros = new int[5];

        //inicializacion de un array forma 1
        numeros[0] = 1123;
        numeros[1] = 23456;
        numeros[2] = 3456;
        numeros[3] = 4567;
        numeros[4] = 7565;

        int a = numeros [0];
        int b = numeros [1];
        int c = numeros [2];
        int d = numeros [3];
        int e = numeros [4];

        //asignar valores de array a variables

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //inicializacion de un array forma 2
        int[] valores = {23, 45, 67, 89, 90};

        //consultar un array
        System.out.println(numeros[4]);
        System.out.println(valores[3]);


    }
}
