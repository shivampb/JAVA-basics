package constructor;

public class Car {
    String color;
    String brand;
    int year;

    public Car(String color, String brand) {
        this.brand = brand;
        this.color = color;
    }

    public String set() {
        return color + " " + brand;

    }

    public static void main(String[] args) {
        Car obj = new Car("black", "Mercedes");
        String display = obj.set();
        System.out.println(" " + display + " ");
    }
}
