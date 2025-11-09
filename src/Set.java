import java.util.HashSet;

public class Set {

    static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        System.out.println(names.size());

        names.add("Lucas");
        names.add("Carlos");
        names.add("Parcero");
        names.add("Aeol");

        System.out.println(names.size());
        ;

    }
}
