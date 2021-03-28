package inheritance;

public class Abstraction extends SuperAbstraction{


    @Override
    void twoNumbers(int x, int y) {
        int z  = x + y;
    }



    // Abstract Classes
    // Abstract method

    // Abstract method: it is just a decalration
    // abstract int sum(intx, inty);

    // Abstract class : collection of both abstract and non abstract methods

}

class Multiplication extends SuperAbstraction{


    @Override
    void twoNumbers(int x, int y) {
        int z  = x * y;
    }

    // Abstract Classes
    // Abstract method

    // Abstract method: it is just a decalration
    // abstract int sum(intx, inty);

    // Abstract class : collection of both abstract and non abstract methods

}

class Subtraction extends SuperAbstraction{


    @Override
    void twoNumbers(int x, int y) {
        int z  = x - y;
    }

    // Abstract Classes
    // Abstract method

    // Abstract method: it is just a decalration
    // abstract int sum(intx, inty);

    // Abstract class : collection of both abstract and non abstract methods

}


class TestAdasdasd{


    public static void main(String[] args) {
        Multiplication x = new Multiplication();
    }
}




abstract class SuperAbstraction {


   abstract void twoNumbers(int x, int y);

   public void helloWorld() {


   }


}