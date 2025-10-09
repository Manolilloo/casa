public class Break_Continue {
    static void main(String[] args) {

        int control = 0, f = 0;

        /*System.out.println("Cargando registros...");
        while (f <= 10) {
            f++;
            if (f == 7) {
                System.out.println("Está en el "+f+" registro.Usted puede continuar...");
                continue;
            }
            if (f == 10) {
                System.out.println("Está en el "+f+" registro.Usted ya NO puede continuar...");
            }
        }
        System.out.println("Fin del proceso.");*/

        for (int i = 0; i <= 20 ; i++) {
            if (i%2==0){
                System.out.println();
                System.out.println("El "+i+" es par");
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
    }
}
