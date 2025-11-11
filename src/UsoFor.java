import java.util.Scanner;

public class UsoFor {
    static void main(String[] args) {

        String mail = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu mail: ");
        mail = entrada.nextLine();
        int arroba = 0;

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {
                arroba++;
            }
        }
        if (arroba == 1) {
            System.out.println("Mail correcto!");
        } else {
            System.out.println("Mail incorrecto!");
        }

    }
}
