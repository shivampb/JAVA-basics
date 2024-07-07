

public class OneD {
    public static void main(String[] args) {
        int marks[] = { 75, 65, 20, 40, 39 };
        int total = 0;
        double average;

        for (int i = 0; i < marks.length; i++) { // Use marks.length instead of 6
            total += marks[i];
            System.out.println("marks:- " + marks[i]);
        }

        System.out.println("total marks:- " + total);
        average = (double) total / 5; // Convert to double for accurate average
        System.out.println("average:- " + average);
    }
}
