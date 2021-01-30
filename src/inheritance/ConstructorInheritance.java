package inheritance;

public class ConstructorInheritance  extends  SuperClassConstructor{


//    ConstructorInheritance() {
//        super();
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//    }



    ConstructorInheritance(int a , int b) {
        super(a,b);
        System.out.println("Hello World");
    }

}


class SuperClassConstructor {

//    SuperClassConstructor() {
//        System.out.println("Hello world in Super");
//    }

    SuperClassConstructor(int a , int b) {
        System.out.println(a + " " + b);
    }


}

class TestIbheritConstructor {

    public static void main(String[] args) {
//        ConstructorInheritance constructorInheritance = new ConstructorInheritance();

        ConstructorInheritance constructorInheritanceB = new ConstructorInheritance(5, 6);

    }
}
