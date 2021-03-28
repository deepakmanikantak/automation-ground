package coreconcepts;

public class ExampleProgram2 {

    int x  = 999;

    void m1(int x) {
        this.x = x;
        System.out.println("M1: X  value is" +x);
    }

    void m2() {
        System.out.println("M2: X  value is" +x);
    }

    public static void main(String[] args) {
        ExampleProgram2 exampleProgram2 = new ExampleProgram2();
        exampleProgram2.m1(222);
        exampleProgram2.m2();
    }
}
