import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.stream.Stream;

public class IoResourceLeak {


    public static void main(String[] args) throws Exception {
        good(null);
        bad(null);
        fixed(null);
    }

    private static void good(Path path) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = null;
            while ((line = reader.readLine() )!= null) {
             // process line
            }
        }
    }

    private static void bad(Path path) throws IOException {
       Files.lines(path).count();
    }

    private static void fixed(Path path) throws IOException {
        try (Stream<String> stream = Files.lines(path)) {
            stream.count();
        }
    }
}