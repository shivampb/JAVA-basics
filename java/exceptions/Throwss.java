class MyException extends Exception {
    public MyException(String string) { // custom exception
        super(string);
    }

}

public class Throwss {
    public static int divide(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("bhai zero se nai hoga");
        } else
            return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(80, 0);
            System.out.println(result);
        } catch (MyException e) {
            System.out.println(e);
        }

    }
}