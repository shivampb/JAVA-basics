public class Twod {
    public static void main(String[] args) {
        int[][] marks = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
