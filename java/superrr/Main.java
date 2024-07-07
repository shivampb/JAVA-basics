package superrr;

//super in constructor invoked

class Animal {

    Animal(String txt) {

        System.out.println(txt + " barks bhau bhau!!");
    }
}

class Cat extends Animal {
    Cat(String txt) {
        super(txt);
        System.out.println("Cat meow meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Dog");
    }
}
