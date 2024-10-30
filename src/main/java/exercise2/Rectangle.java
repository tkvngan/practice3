package exercise2;

public class Rectangle extends Shape{
    double length;
    double side;

    public Rectangle(double length, double side) {
        super();
        this.length = length;
        this.side = side;
    }

    public double calculateArea() {
        return this.length * this.side;
    }
}
