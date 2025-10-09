public class ArreglosCombinacion {
    static void main(String[] args) {
        String[] productos = {  "",
                                "Martillo",
                                "Destornillador",
                                "Alicate",
                                "Llave inglesa",
                                "Cinta métrica",};

        double preciosEnEuros[] = {0, 10.5, 5.75, 8.20, 15.30, 3.50};

        for (int f = 1; f < productos.length ; f++) {


            if (preciosEnEuros[f]<10){
                System.out.println(productos[f]+": $"+preciosEnEuros[f]);
                System.out.println("No paga impuestos");
                System.out.println("---------------------");
            }else {
                System.out.println(productos[f]+": $"+preciosEnEuros[f]);
                System.out.println("Paga impuestos");
                System.out.println("---------------------");
            }


        }
    }
}
