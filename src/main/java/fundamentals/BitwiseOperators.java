package fundamentals;

public class BitwiseOperators {


    public static void main(String[] args) {
        // Bitwise : & |
        // It checks for both conditions whether first condition is true or false

        // | : If either of the bits is 1 it gives 1 else zero
        // || : If either of the condition is true it will return true . T :1

        // & : If both bits is 1 it gives 1 else zero
        // && : If both is true it will return true . T : 1

//        int a = 5;
//        int b = 7;
//        int c = 8;

        // 16
        //     32 16 8 4 2 1
//        5:    0  0  0 1 0 1
//        7:    0  0  0 1 1 1
//      o/p |:  0   0  0  1   1  1  = 7
//      o/p &:  0   0  0  1   0  1  = 5

//        5:    0  0  0 1 0 1
//        8:    0  0  0 1 1 1

        int a = 5;
        int b = 7;
        int c = 8;

        System.out.println(a | b);
        System.out.println(a & b);

        System.out.println(a < b | a < c);

        // Explaining the Difference on the Point (t checks for both conditions whether first condition is true or false)
        // && : Any first one is false it wont check for other condition
        // & : checks for both conditions
        System.out.println(a > b && a++ < c); // F
        System.out.println(a); // 5
        System.out.println(a > b & a++ < c); // F
        System.out.println(a); // 6

        // || : any first one is True it wont check for other condition
        // | : checks for both conditions
        System.out.println(a > b || a++ < c); // T
        System.out.println(a); // 7
        System.out.println(a > b & a++ < c); // F
        System.out.println(a); // 6
    }
}
