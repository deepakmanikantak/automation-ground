package fundamentals;

public class TernaryOperator {

    // ? :

    // Replacement for if-else condition
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 0;

//        if( a > b) {
//            c = a;
//        } else {
//            c = 10;
//        }


        // == and !=

        // USE case . In Selenium we need to provide browser name
        // if we provide invalid browser name than we need to print error in the console. In such cases we will come across == operator
        //  or price compraisons

        if(a != b){
            System.out.println("Close Browser");
        } else{
            System.out.println("Open Browser");
        }



        c = a>b ? a : 10;
        System.out.println(c);


        String aab = "amazon".equalsIgnoreCase("flipkart") ? "amazon" : "flipkart";

        System.out.println(c);
        System.out.println("amazon".equalsIgnoreCase("AMAZON"));

    }
}
