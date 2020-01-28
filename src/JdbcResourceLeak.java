import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class JdbcResourceLeak {


    public static void main(String[] args) throws Exception {
        good(null);
        bad(null);
    }

    private static void good(Connection conn) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("update mytable set updated = now()");
        try (stmt) {
            stmt.executeUpdate();
        }
    }

    private static void bad(Connection conn) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("update mytable set updated = now()" +
                " where key = ?");
        stmt.setString(1, "abc");
        try (stmt) {
            stmt.executeUpdate();
        }
    }
}