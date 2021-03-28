package coreconcepts;

public class MethodB {


    public static void main(String[] args) {
        MethodB b = new MethodB();

        b.getSquareOfANumber(5);
        Table abc = new Table();
        b.printTableProperties(abc);
    }


    public void getSquareOfANumber(int a) {
        System.out.println(a * a);
        String s = MethodsJava.s;
    }

    public void printLowerCase(String a) {


    }


    public void printTableProperties(Table def) {
        def.method1();
    }


}
