import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Equality {


    public static void main(String[] args) throws Exception {
        passes();
        fails();
    }

    private static void passes() {
        Integer int1 = Integer.valueOf(8);
        Integer int2 = Integer.valueOf(8);
        System.out.println((int1 == int2) + " " + int1.equals(int2));
    }


    private static void fails() {
        Integer int1 = Integer.valueOf(8_000);
        Integer int2 = Integer.valueOf(8_000);
        System.out.println((int1 == int2) + " " + int1.equals(int2));
    }

}