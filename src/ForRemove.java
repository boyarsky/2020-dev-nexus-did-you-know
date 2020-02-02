import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ForRemove {

    public static void main(String[] args) {

        passes();
        copyOnWrite();
        clear();
        removeIf();
        fails();
    }

    private static void clear() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("red");
        list.add("alliance");
        list.add("blue");
        list.add("alliance");

        list.clear();

        System.out.println(list);
    }

    private static void removeIf() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("red");
        list.add("alliance");
        list.add("blue");
        list.add("alliance");

       list.removeIf(x -> true);

        System.out.println(list);
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
