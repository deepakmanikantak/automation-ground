package fundamentals;

public class TypeCasting {

    // process of converting value from one type to another type

    // 2 types: 1. primitive type casting 2. Reference Type Casting

    // primitive type : Widening Type CAsting 2) Narrowing Type casting

    // Widening Type CAsting: Process of converting value from lower type to higher type..It will be done by the compiler implicityly

    public static void main(String[] args) {
        byte b = 55;
        int i = b; // compiler will do it automaticcaly

        System.out.println(i);

        // Narrowing: converting higher type to lower type. This should be done explicitly & there will be a loss of prcission

        double d = 3.2384723984623784283;
        System.out.println(d);
        float f = (float) d;

        System.out.println(f);

    }
}
