import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ForRemove {

    public static void main(String[] args) {

        passes();
        copyOnWrite();
        fails();

    }

    private static void copyOnWrite() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("red");
        list.add("alliance");
        list.add("blue");
        list.add("alliance");

        for(String current : list) {
            list.remove(current);
        }

        System.out.println(list);
    }

    private static void fails() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("alliance");
        list.add("blue");
        list.add("alliance");

        for(String current : list) {
            list.remove(current);
        }

        System.out.println(list);
    }

    private static void passes() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("alliance");

        for(String current : list) {
            list.remove(current);
        }

        System.out.println(list);
    }
}
