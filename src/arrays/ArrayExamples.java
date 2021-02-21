package arrays;

public class ArrayExamples {

    // Task is to get minimum number from an array


    public static void main(String[] args) {

        int[] a = {10, 5, 1 , 65, 89, 34, 56, 12, 0, 10};
        int[] b = {10, 5, 1 , 65, 89, 34, 56, 12, 0, 10};
        int[] c = {10, 5, 1 , 65, 89, 34, 56, 12, 0, 10};
        int[] d = {10, 5, 1 , 65, 89, 34, 56, 12, 0, 10};
        int[] e = {10, 5, 1 , 65, 89, 34, 56, 12, 0, 10};

        ArrayExamples.getMinNumberFromArray(a);
        ArrayExamples.getMinNumberFromArray(b);
        ArrayExamples.getMinNumberFromArray(c);
        ArrayExamples.getMinNumberFromArray(d);
        ArrayExamples.getMinNumberFromArray(e);
    }

    public static void getMinNumberFromArray(int[] a) {
        int min = a[0];

        for (int i = 1; i<a.length ; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
