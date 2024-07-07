package superrr;

class dog {
    void eat() {
        System.out.println("dog eats biscuits");
    }
}

class cat extends dog {
    void eat() {
        System.out.println("cat eats milk");
    }

    void work() {
        super.eat();

    }
}

public class Methodd {
    public static void main(String[] args) {
        cat myCat = new cat();
        myCat.eat();
        myCat.work();
    }
}
