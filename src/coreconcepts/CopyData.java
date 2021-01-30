package coreconcepts;

public class CopyData {


    int x, y;

    void setData(int x, int y) {
        this.x = x;
        this.y = y;
    }


    void copyData(CopyData copyData) {
        x = copyData.x;
        y = copyData.y;
    }

    void getData() {
        System.out.println("X val is:" + x);
        System.out.println("Y val is:" + y);
    }


    public static void main(String[] args) {
        CopyData x = new CopyData();
        x.getData();
        x.setData(10, 20);
        x.getData();

        CopyData copyData2 = new CopyData();
        copyData2.copyData(x);

        CopyData copyData3 = new CopyData();
        copyData2.copyData(copyData2);

    }
}
