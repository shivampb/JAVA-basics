package comadnlines;
//adding n number like => java commandline 5 10 15

public class commandline {
    public static void main(String[] args) {

        System.out.println("Arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

// public class commandline {
// public static void main(String args[]) {
// int sum = 0;
// for (int i = 0; i < args.length; i++) {
// sum = sum + Integer.parseInt(args[i]);
// }
// System.out.println(sum);
// }
// }
