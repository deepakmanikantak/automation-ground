package inheritance;

public class TestClass {


    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        System.out.println(childClass.name);
        childClass.superClassMethod();
    }

    /*

    Two Types

    1. Single 2. Multiple


    2. Multiple
          Multilevel Inheritance
          Hireearchial Inheritacnce
          Hybrid Inhertiance
          Multipath Inhetiance


      super             super       super       super                   super                   super

      sub                   sub                 super           sub             sub             sub         super

                                                super                                           sub



                                  super

                            sub            sub

                            super        super

                                    sub

     */


}
