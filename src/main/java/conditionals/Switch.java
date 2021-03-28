package conditionals;

public class Switch {


    // exeuctes only one statement out of multiple conditions unlike if-else ladder

    // it works with byte, short, int, long s, String, Wapper classes , enum type

    // byte : Byte
    // long : Long
    // int : Integer
    // boolean : Boolean


    public static void main(String[] args) {


//        if (marks < 50) {
//            System.out.println("Fail");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 65 && marks < 75) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else if (marks >= 50 && marks < 65) {
//            System.out.println("D Graade");
//        } else {
//            System.out.println("Please input only numbers between 0 - 100");
//        }

        // syntax
        // N.. of cases
        // it accespts primitivi data

        String browser= "chromE";

        switch (browser.toLowerCase()) {
            case "chrome":
                System.out.println("Launch Chrome Browser");
            case "firefox":
                System.out.println("Launch Firefox Browser");
            default:
                System.out.println("Invalid Input. Please input values either 30, 20 or 10");
        }
    }

}
