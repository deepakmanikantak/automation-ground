package arrays;

public class TwoDimensionalArray {


    int[][] a;
    int[] b[][];
    int[][] c;

    public static void main(String[] args) {
        int[][] arr = new int[3][5];

        arr[0][0] = 5;
        arr[0][1] = 6;
        arr[0][2] = 7;

        arr[1][0] = 8;
        arr[1][1] = 9;
        arr[1][2] = 10;

        arr[2][0] = 11;
        arr[2][1] = 12;
        arr[2][2] = 13;

        System.out.println(arr.length);


        int a[][] = new int[3][];

        a[0] = new int[3];
        a[1] = new int[2];
        a[2] = new int[5];

        // Algorithm
        // 1. Print all Coloumn values in 1st row
        // 1. Print all Coloumn values in 2nf row
        // 1. Print all Coloumn values in 3rd row ..... nthrow (Size of array)


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }


    }


}
