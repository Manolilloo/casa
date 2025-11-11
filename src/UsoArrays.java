public class UsoArrays {

    static void main(String[] args) {


        /*int[] miArray = new int[5];

        miArray[0] = 12;
        miArray[1] = 66;
        miArray[2] = 33;
        miArray[3] = 4;
        miArray[4] = 53;
*/

        int[] miArray = {12, 5, 76, 22, 12, 3};         //Otra manera más cómoda

        int suma = 0;

        for (int i = 0; i < miArray.length; i++) {

            suma = suma + miArray[i];

        }

        double media = (double) suma / miArray.length;

        System.out.println("La media de todas las edades es de: " + media);
    }
}
