package coreconcepts;

public class StaticConcepts {

    static int x = 100;
    int a;
    int b;

    static {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        printHello();

        x = 100;
        StaticConcepts a = new StaticConcepts();
        System.out.println(a.a);
        System.out.println(StaticConcepts.x);

        StaticConcepts b = new StaticConcepts();
        System.out.println(b.a);
        System.out.println(StaticConcepts.x);
    }

    public static void printHello() {
        System.out.println("Hello");
    }


}
