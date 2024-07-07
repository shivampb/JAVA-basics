package overiding;

class dog {
    void makeSound() {
        System.out.println("dog is barking bhau bhau");
        System.out.println("bhau bhau bhau bhau bhau");
    }
}

class cat extends dog {
    void makeSound() {
        System.out.println("CAT does meow meow ");
    }
}

public class Main {
    public static void main(String[] args) {
        cat objCat = new cat();
        objCat.makeSound();
        dog objDog = new dog();
        objDog.makeSound();
    }
    }

