package conditionals;

public class NestedSwitch {

    public static void main(String[] args) {


        int college = 2;
        char batch = 'C';


        switch (college) {
            case 1:
                System.out.println("Year 1");
                break;
            case 2:
                switch (batch) {
                    case 'A':

                }

                System.out.println("Year 2");
                break;
            case 3:
                System.out.println("Year 3");
                break;
            case 4:
                System.out.println("Year 4");
                break;
            default:

        }
    }
}
