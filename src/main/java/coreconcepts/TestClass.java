package coreconcepts;

public class TestClass {

    int x;
    String z;
    Table y;
    Student s;

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        System.out.println( testClass.z);
        System.out.println( testClass.y);

        Student s = new Student();
        s.no = 10;
        s = null;
        System.out.println(s);

        Student s1 = new Student();
        System.out.println(s1);
        System.out.println(s1.no);

        System.out.println(s);

        Student s2 = new Student();
        Student s3 = new Student(2, "Rahul", 2);
        Student s4 = new Student(3, "Krishna", 3);
    }
}
