package exercise2;

public class Circle extends Shape{
    double radius;

    public Circle (double radius) {
        super();
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * this.radius * this.radius;
    }
}
