package abstractClass;

abstract class abs {

    public abs() {
        System.out.println("hello i am a abstract class method hello");
    }

    abstract public void greet();

}

class child extends abs {

    public void greet() {
        System.out.println("Good morning");
    }
}

public class Mainn {
    public static void main(String[] args) {
        child obj = new child();
        obj.greet();
    }
}