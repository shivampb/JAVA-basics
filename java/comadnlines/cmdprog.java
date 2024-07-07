package comadnlines;
import java.util.Scanner;

public class cmdprog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the input from the user
        int number = scanner.nextInt();

        // Close the scanner to release resources
        scanner.close();

        // Print numbers from 1 to the input integer
        System.out.println("Numbers from 0 to " + number + ":");
        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
