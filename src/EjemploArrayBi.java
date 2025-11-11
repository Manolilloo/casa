public class EjemploArrayBi {

    static void main(String[] args) {

        double acumulado;
        double interes = 0.10;

        double[][] saldo = new double[6][5];


        for (int col = 0; col < saldo.length; col++) {

            saldo[col][0] = 10000;

            acumulado = 10000;

            for (int fila = 1; fila < 5; fila++) {

                acumulado = acumulado + (acumulado * interes);

                saldo[col][fila] = acumulado;


            }

            interes += 0.01;
        }

        for (int col = 0; col < saldo.length; col++) {
            for (int filas = 0; filas < saldo[0].length; filas++) {
                System.out.printf("%1.2f",saldo[col][filas]);
                System.out.print(" ");


            }
            System.out.println();

        }
    }
}
