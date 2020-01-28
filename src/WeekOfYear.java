import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeekOfYear {


    public static void main(String[] args) throws Exception {
        xmasEve();
        newYearsEve();
    }

    private static void xmasEve() {
        LocalDate xmasEve = LocalDate.of(2019, Month.DECEMBER, 24);
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = xmasEve.get(weekFields.weekOfWeekBasedYear());
        int week = xmasEve.get(weekFields.weekOfYear());
        System.out.println(weekNumber + " " + week);
    }
    private static void newYearsEve() {
        LocalDate newYearsEve = LocalDate.of(2019, Month.DECEMBER, 31);
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = newYearsEve.get(weekFields.weekOfWeekBasedYear());
        int week = newYearsEve.get(weekFields.weekOfYear());
        System.out.println(weekNumber + " " + week);

    }
}