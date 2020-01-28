import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapComparator {

    public static void main(String[] args) {
        passes();
        fails();
    }


    private static void fails() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");

        Comparator<Character> c = Comparator.naturalOrder();

      // System.out.println(ohMy.collect(Collectors.groupingBy(String::length,
        //                  Collectors.mapping( s-> s.charAt(0), Collectors.minBy(Comparator.naturalOrder())))));
     System.out.println(ohMy.collect(Collectors.groupingBy(String::length,
              Collectors.mapping((String s)-> s.charAt(0), Collectors.minBy(Comparator.naturalOrder())))));
    }

    private static void passes() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");

        Comparator<Character> c = Comparator.naturalOrder();

        System.out.println(ohMy.collect(Collectors.groupingBy(String::length,
                Collectors.mapping(s -> s.charAt(0), Collectors.minBy(c)))));
    }
}
