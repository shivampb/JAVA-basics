package mypackage;

public class aoc {
    private double radius;
    private final double pi = 3.14159;

    // get radius
    public double getRadius() {
        return radius;
    }

    // set radius
    public void setRadius(double radi) {
        this.radius = radi;
    }

    public double calculateArea() {
        return pi * radius * radius;
    }

}
