package inheritance;

public class OverridingTest  extends SuperClassOveriding {

    public void helloWorld() {
        System.out.println("Hellp World");
        System.out.println("Hellp World");
        System.out.println("Hellp World");
        System.out.println("Hellp World");
        System.out.println("Hellp World");
    }

    public void retOfIntereset() {
        System.out.println(8);
    }

    public static void main(String[] args) {
        OverridingTest overridingTest = new OverridingTest();
        overridingTest.helloWorld();
    }

}



class SuperClassOveriding {


    public void helloWorld() {
        System.out.println("Hellp World");
    }

    public void retOfInterese() {
        System.out.println(7);
    }

}
