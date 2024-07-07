package superrr;

// Refer Immediate Parent Class Instance Variable. 
class bear {
    String color = "White";
}

class dogg extends bear {
    String color = "Black";

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class Variablee {
    public static void main(String[] args) {
        dogg objDog = new dogg();
        objDog.printColor();
    }

}
