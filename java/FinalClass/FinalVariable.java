public class FinalVariable {
    static final int MY_CONSTANT = 15;

    public static void main(String[] args) {
        // MY_CONSTANT = 50; cannot be changed once final
        System.out.println(MY_CONSTANT);
    }
}