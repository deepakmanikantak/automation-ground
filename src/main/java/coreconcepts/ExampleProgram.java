package coreconcepts;

public class ExampleProgram {


    void method1(byte b) {
        System.out.println("I am byte " + b);
    }

    void method1(short b) {
        System.out.println("I am short " + b);
    }

    void method1(int b) {
        System.out.println("I am int " + b);
    }

    public static void main(String[] args) {
        ExampleProgram  s = new ExampleProgram();
        s.method1((short)10);
    }

}