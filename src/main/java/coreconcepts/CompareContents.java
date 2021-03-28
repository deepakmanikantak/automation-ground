package coreconcepts;

public class CompareContents {

    int x,y;


    void setData(int x, int y) {
        this.x = x;
        this.y = y;
    }


    void getData() {
        System.out.println("X val is:" + x);
        System.out.println("Y val is:" + y);
    }

    boolean compareData(CompareContents compareContents) {

        if( x == compareContents.x && y == compareContents.y)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        CompareContents a = new CompareContents();  // - > 0 0
        a.setData(10, 20); // -> 10, 20

        CompareContents b = new CompareContents(); // 0 0
        b.setData(10, 20);

        if(a.compareData(b)) {
            System.out.println("Both Objects have same Data");
        } else {
            System.out.println("Both Objects does not have same Data");
        }
    }



}
