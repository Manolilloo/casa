public class ArrayBidimensional {

    static void main(String[] args) {
        int[][] matriz =
                {       {1, 2, 3},
                        {1, 2, 3},
                        {1, 2, 3}};

        for (int columnas = 0; columnas < matriz.length; columnas++) {

            for (int filas = 0; filas < matriz[0].length; filas++) {

                System.out.print(matriz[columnas][filas]+" ");
            }

            System.out.println();

        }
    }
}