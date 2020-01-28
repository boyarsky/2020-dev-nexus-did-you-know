public class Overloading {

    public void check(Number number) {
        System.out.print("Number ");
    }

    public void check(Integer integer) {
        System.out.print("Integer ");
    }

    public void delegator(Number number) {
        check(number);
    }

    public static void main(String[] args) throws Exception {
        Number num = Integer.valueOf(42);
        Integer integer = Integer.valueOf(42);
        Overloading target = new Overloading();
        target.check(num);
        target.delegator(num);
        target.check(integer);
        target.delegator(integer);

    }
}
