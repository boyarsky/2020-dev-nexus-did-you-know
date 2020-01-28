import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDuplicates {

    public static void main(String[] args) {
        passes();
        fails();
    }

    private static void fails() {

        String[] words = { "all", "the", "words", "in", "the", "world" };

        Set<String> set = Set.of(words);

        System.out.println(set);

    }

    private static void passes() {

        String[] words = { "all", "the", "words", "in", "the", "world" };

        Set<String> set = new HashSet<>(Arrays.asList(words));

        System.out.println(set);

    }
}
