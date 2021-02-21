package interfaces;

public interface InterFaceExample {

    int MIN =5;
    void print();


    /*

    class     interface     interface

    extends   implements    extends

    class     class         interface

     */

}

interface InterFaceExampleB{

    int MIN =5;
    void print();


    /*

    class     interface     interface

    extends   implements    extends

    class     class         interface

     */

}

class ABC implements InterFaceExample, InterFaceExampleB {


    @Override
    public void print() {

    }
}

/*

interface A{}
interface B{}
class C{}

class D implements A, B extends C {}
class D  extends C implements A, B {}


class D extends C implements B ,A {}

 */
