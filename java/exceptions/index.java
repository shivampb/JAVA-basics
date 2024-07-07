
import java.util.Scanner;
import java.util.InputMismatchException;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(" enter a number to divide ");
            int x = scanner.nextInt();
            System.out.println(" enter a number to divide by ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("result :- " + z);
        } catch (ArithmeticException e) {
            System.out.println("you cannot divide by 0!! IDIOT !!");
        } catch (InputMismatchException e) {
            System.out.println("-----------------------");
            System.out.println("Enter a number OMFG!!!");
            System.out.println("-----------------------");
        } finally {
            scanner.close();
        }
    }

}