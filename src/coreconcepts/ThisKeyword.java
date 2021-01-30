package coreconcepts;

public class ThisKeyword {

    int x = 100;


    // This is a pointer variable
    // Every instance method of a class will have this
    // It is aalways used to hold the address of the current object

  // local and instance decalred with same name

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword();
        System.out.println(thisKeyword);
        thisKeyword.method1();

        ThisKeyword thisKeyword2 = new ThisKeyword();
        thisKeyword2.method1();
    }

    void method1( ) {
        int x = 50;
        System.out.println(" From M1 method Address of conj" + this);
        System.out.println(" X is " + x);
        System.out.println(" X is " + this.x);
    }

    void method2( ) {
        System.out.println(" From M2 method Address of conj" + this);
    }
}
