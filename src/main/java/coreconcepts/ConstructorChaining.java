package coreconcepts;

public class ConstructorChaining {


    // this()
    // this(5, 6)


    ConstructorChaining() {
        System.out.println("This is Default Constructor");
    }

    ConstructorChaining(int x) {
        this();
        System.out.println("This is One Param Constructor" + x);
    }


    ConstructorChaining(int x, int y) {
        this(x);
        System.out.println("This is Two Param Constructor" + x + " " + y);
    }

    public static void main(String[] args) {
        ConstructorChaining s  = new ConstructorChaining(5, 6);


        s= null;



    }


}
