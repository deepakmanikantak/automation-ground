package arrays;

public class Arrays {


    // Array is a collection of similat type of elements
    // Array is used to store the data
    // You can only store the elements of fixed size

    // How to store elements in an Array
    // How to Retrieve


    //       |0 |1 |2 |3| 4..| | | | | | |

    //     | 0|1 |2 |3 |4 |


    // Single Dimension
    // Multi  Dimension

    // single Dimenstion Declaration

   /* datatype[] arr;

    datatype []arr;

    datatype arr[]; */

    // Array instantiation

    // arr = new datatype[size];

    public static void main(String[] args) {

        int[] a = new int[3];

        System.out.println(a.length);

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        // print all elements in an array
        for (int i=0;  i< a.length; i++) {
            System.out.println(a[i]);
        }


        int[] b = {1,2,3,4,5,6,7,8,9,10};
//        for (int i=0;  i< b.length; i++) {
//            System.out.println(b[i]);
//        }


        // For each loop

/*        for (Datatype a : list/array) {


        } */

        for (int x : b) {
            System.out.println(x);
        }






    }










}
