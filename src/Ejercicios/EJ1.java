package Ejercicios;

public class EJ1 {
    static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[A.length - i - 1] + " "); // Estos son los indices a los que va a llegar por la formula

        }
    }
}
