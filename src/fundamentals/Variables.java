package fundamentals;

import com.sun.org.apache.xpath.internal.operations.Variable;

public class Variables {

    // Local Variable/fields

    // Instance/field or Global or object variables // non static fields
    // For all the instance fields memory is allocated within the Object
    // Every instance field must be referred by Object Reference in the Static Context
    // Every instance field by default will get initialized by their default values

    //wheneever local an gloval variable is dcalred with same nam, priority is given to local field

    // Static Variable/fields
    int a = 50;
    String s;
    boolean myname;
    int b;

    // You cannot create a static variable inside a method. ?

    static int c = 50;



    public static void deepak() {
        System.out.println(c);
        int a = 60;
        System.out.println(a);
    }

    // non static method
    public void ram() {
        int c =50;
        int b = 10;
        boolean isStudentPresent = true;

        System.out.println(b);
        System.out.println(isStudentPresent);
    }


    // [Modifiers] <Datattype <vnmae> = <vvalue>;

    public static void main (String[] args) {


        int a = 50;
        a= 40;
        System.out.println(a);

        Variables abc = new Variables();
        abc.deepak();
        System.out.println(abc.a);

        abc.s = "Krishna";
        System.out.println(abc.s);
        System.out.println(abc.myname);
        System.out.println(abc.b);
        abc.ram();
    }



}
