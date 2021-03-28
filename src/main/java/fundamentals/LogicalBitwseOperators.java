package fundamentals;

public class LogicalBitwseOperators {



    // Logical Operators - && ||
    // 1. Logical && doesnot check for second condition if first condition is false. It checks second condition only if it is true
    public static void main(String[] args) {

        // Condition1 && Condition2  - > true
        // ->
        // T && T : T
        //  T && F : F
        //  F && T : F
        //  F && F : F



        int a = 10;
        int b =  5;
        int c = 1;

        System.out.println(a<b && a<c);  //f
        System.out.println(b<a && c<a); // t
        System.out.println(b<a && a<c); // f


        // OR Operator : ||

        // Logical || doesnot check for second condition if first condition is true. It checks second condition only if it is false

        // T || T : T
        //  T || F : T
        //  F || T : T
        //  F || F : F
        System.out.println("===========");
        System.out.println(a<b || a<c); //false
        System.out.println(b<a || a<c); // true
        System.out.println(a<c || b<a ); // true
        System.out.println(a<c || b<a ); // true
    }
}
