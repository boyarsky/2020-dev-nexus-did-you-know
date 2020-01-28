import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class VarAndInference {

    public static void main(String[] args) {
        List<Integer> x1 = List.of();
        var x2 = List.of(1, 2, 3);
        Stream.of(x1, x2)
                .flatMap(x -> x.stream())
                .map(x -> x + 1)
                .forEach(System.out::print);

    }
}
