package fundamentals;

public class Printing {



// println method belongs to PrintStream class of java.io package
    // This method can take at max one argumnet
    // It is an overloaded method ( It's a process a defining more than one method with same name for different purpose)

    public static void main(String[] args) {
        System.out.println(5);
        System.out.print("Ram");
        System.out.print(20.5);
        System.out.print('c');

        String s = "Ram %f";

        // Format Specifiers or Control Strings
        // int %d
        // long %ld
        // unsigned int %u
        // unsigned long %lu

        // float %f
        // double %lf
        // character %c
        // String %s


        System.out.printf(s,5.0f);
    }


    public void ram(String s){

    }

    public void ram(String s, int no){

    }


}
