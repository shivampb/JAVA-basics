package Inheritance;

public class Main {
    public static void main(String[] args) {

        car c = new car();
        // c.go();

        bicycle b = new bicycle();
        // b.stop();

        // System.out.println(c.speed);
        // System.out.println(b.speed);

        System.out.println("car have " + c.wheels + " wheels");
        System.out.println("----------------------------------");
        System.out.println("bicyle have " + b.wheels + " wheels");

    }
}
