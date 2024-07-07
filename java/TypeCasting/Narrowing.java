public class Narrowing { // EXPLICIT use when larger data get convert in to small, Data loss risk.
    public static void main(String[] args) {
        double A =10.50;
        int B = (int)A; // lost After decimal Portion
        System.out.println("Double to int "+B);

    }
}
