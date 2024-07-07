package ThisKeyword;

// Implementing 'this';

class Dog {
    private String brand;
    private String color;
    private int year;

    public Dog(String brand, String color) {
        this.brand = brand;
        this.color = color;

    }

    public Dog(String brand, String color, int year) {
        this(brand, color);
        this.year = year;

    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}

public class Demo {
    public static void main(String[] args) {
        Dog obj = new Dog("BMW", "BLACK", 1996);
        System.out.println(obj.getBrand());
        System.out.println(obj.getColor());
        System.out.println(obj.getYear());
    }
}
