package constructor;


class RRectangle {
    public int length;
    public int breadth;

    RRectangle(int a, int b) {
        length = a;
        breadth = b;
    }

    public void show() {
        System.out.println("Value of length= " + length + ", breath = " + breadth);

    }
}

public class basicConst {
    public static void main(String[] args) {
        RRectangle obj = new RRectangle(10, 50);
        obj.show();
    }

}
