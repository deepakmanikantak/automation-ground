package coreconcepts;

public class MethodsJava {

    int a;
    String b;
    static String  s;

    // Method without argument & without return value
    public void sumOfTwoNumbers() {
        int a = 5;
        int b = 6;
        String f = s;
        int c = a + b;
        System.out.println(c);
        System.out.println("Hello");
    }

    // Method with argument & without return value
/*
    public void sumOfTwoNumbers(int a, int b) {

        String s = "Koti";

        int c = a + b;
        System.out.println(c);
    }
*/

    // return type may or may not be same
    // list of arguments should be different
    // Method name should be same

    public int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public void sumOfTwoNumbers(int a, int b, int c) {

    }

    // Method without argument & without return value
    // With argumnet , Without Return value
    // With argument and with return value


    /* syntax

    [Modifiers] <retrun type> <methodName>([List of arguments]) {

    [local variables];
    statements(s);
    [return <value/variable>]

    }

     */



    public static void main(String[] args) {

        //  do sum of two numbers

        // 5 +6
        int a = 5;
        int b = 6;

        int c = a + b;

        System.out.println(c);


        int d = 9;
        int e = 8;
        int f = d + e;

        System.out.println(f);

        MethodsJava mj = new MethodsJava();
        mj.sumOfTwoNumbers();
        mj.sumOfTwoNumbers(5, 6);
        mj.sumOfTwoNumbers(7, 8);
        mj.sumOfTwoNumbers(9, 10);


        // after Sum of two numbers, add 10 to the result.


        int abc = mj.sumOfTwoNumbers(9, 10);
        System.out.println(abc + 10);
        System.out.println(abc + 10);
    }


}
