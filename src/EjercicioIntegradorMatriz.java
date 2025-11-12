import marin.Suso;

public class EjercicioIntegradorMatriz {
    static void main(String[] args) {

        int ancho = Suso.leerEnteroPositivoEntre("Ingresa el ancho", 1, 30);
        int alto = Suso.leerEnteroPositivoEntre("Ingresa el alto", 2, 10);
        imprimirMatrizDeSimbolos(ancho, alto);
    }

    public static void imprimirMatrizDeSimbolos(int ancho, int alto) {

        for (int i = 0; i < alto; i++) {
            Suso.imprimirSimbolo('x', ancho);
        }


    }
}
