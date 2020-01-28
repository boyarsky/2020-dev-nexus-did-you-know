import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class YearFormatting {


    public static void main(String[] args) throws Exception {
        xmasEve();
        newYearsEve();
    }

    private static void xmasEve() {
        LocalDate xmasEve = LocalDate.of(2019, Month.DECEMBER, 24);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        System.out.println(xmasEve.format(format) + " " + xmasEve.format(format2));
    }
    private static void newYearsEve() {
        LocalDate newYearsEve = LocalDate.of(2019, Month.DECEMBER, 31);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        System.out.println(newYearsEve.format(format) + " " + newYearsEve.format(format2));
    }
}