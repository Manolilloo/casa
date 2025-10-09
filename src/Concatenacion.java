public class Concatenacion {
    static void main(String[] args) {
        String nombre = "Homero";
        String apellido = "Simpson";
        int valor = 100;
        String palabra1="Aprendiendo", palabra2="Java";
        String saludo = palabra1 +" "+ palabra2;

        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Nombre completo: "+nombre +" "+ apellido);
        System.out.println("Valor: "+valor);
        System.out.println("Estoy "+palabra1+" "+palabra2);
        System.out.println(saludo);
        System.out.println(palabra1.concat(" "+palabra2));
    }
}
