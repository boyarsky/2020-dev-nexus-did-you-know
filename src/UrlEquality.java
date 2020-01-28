import java.net.URL;

public class UrlEquality {

    public static void main(String[] args) throws Exception {
        URL url1 = new URL("https://google.com");
        URL url2 = new URL("https://google.com");
        System.out.println(url1.equals(url2));
    }
}
