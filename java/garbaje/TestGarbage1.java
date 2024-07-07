class test {

    public void finalize() {
        System.out.println("object is garbage collected");
    }
}

public class TestGarbage1 {
    public static void main(String args[]) {
        test s1 = new test();
        test s2 = new test();
        s1 = s2;

        System.gc();
    }
}