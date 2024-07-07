

final class FinalClass {
    void demo() {
        System.out.println("shivam p bhardwaj");
    }
}

// class maggie extends FinalClass {
// shows the error
// }

public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.demo();
    }

}
