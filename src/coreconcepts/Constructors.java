package coreconcepts;

public class Constructors {


    //  DB Connection - > Run Query


    Constructors() {

    }



    Constructors(int a, int b) {

    }


    public static void main(String[] args) {
        Constructors s = new Constructors(5, 6);
        Constructors s1 = new Constructors();
        s.helloWorld();
        s.helloWorld();
        s.helloWorld();
        s.helloWorld();
    }


    public void helloWorld() {
        System.out.println("Hello World");
    }

}
