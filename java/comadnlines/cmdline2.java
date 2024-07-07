package comadnlines;

import java.util.Scanner;

public class cmdline2 {

    public static void main(String[] args) {
        // int n, sum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter num for sum");
        // n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);
        try {

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a + b;
            System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("enter value");
        }

    }

}