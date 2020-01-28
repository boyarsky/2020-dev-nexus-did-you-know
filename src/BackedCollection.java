import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class BackedCollection {


    public static void main(String[] args) throws Exception {
        keeps();
        removes();
    }

    private static void keeps() {
        Map<String, String> map = new HashMap<>();
        map.put("Braves", "Atlanta");
        map.put("Mets", "NYC");

        Set<String> keys = new HashSet<>(map.keySet());
        keys.remove("Mets");

        System.out.println(map);
    }


    private static void removes() {
        Map<String, String> map = new HashMap<>();
        map.put("Braves", "Atlanta");
        map.put("Mets", "NYC");

        Set<String> keys = map.keySet();
        keys.remove("Mets");

        System.out.println(map);
    }

}