package comadnlines;
class fibu {
    public int fibonacci(int n) {
        if (n <= 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

public class fiboCMD {
    public static void main(String[] args) {
        fibu obj = new fibu();
        int a = Integer.parseInt(args[0]);
        for (int i = 0; i < a; i++) {
            System.out.print(obj.fibonacci(i) + " ");
        }
    }

}
