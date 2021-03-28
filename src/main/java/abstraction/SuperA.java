package abstraction;

public abstract class SuperA {

    int x = 100;

    void method1() {
        System.out.println("Method 1 od SuperA");
    }

    abstract void method2();

}

class SubB extends SuperA {

    int x = 200;

    @Override
    void method2() {
        System.out.println("Method 2 od SuperA");
    }

    void method3() {
        int x = 500;
        System.out.println("Method 3 od SuperB" + x);
        System.out.println("Method 3 od SuperB" + this.x);
        System.out.println("Method 3 od SuperB" + super.x);
    }
}

class SubC extends SuperA {


    @Override
    void method2() {
        System.out.println("Method 2 od SuperA in SUBC");
    }

    void method3() {
        System.out.println("Method 3 od SuperB");
    }
}

class AbstractExample1  {

    public static void main(String[] args) {
        SubB subB = new SubB();
        subB.method1();

        SuperA superA = new SuperA() {
            @Override
            void method2() {

            }
        };


        superA.method2();
        superA.method1();


        SuperA superAA = new SubB();
        superAA.method2();

        SuperA superAAA = new SubC();
        superAAA.method2();

        //  A super class reference variable can hold the object of any of its subclass

    }

}










