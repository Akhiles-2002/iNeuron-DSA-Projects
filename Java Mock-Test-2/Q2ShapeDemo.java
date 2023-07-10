abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}

public class Q2ShapeDemo {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(5, 3);
        calculator.printArea(rectangle);  // The area of the shape is: 15.0

        Circle circle = new Circle(2);
        calculator.printArea(circle);  // The area of the shape is: 12.566370614359172

        Triangle triangle = new Triangle(4, 6);
        calculator.printArea(triangle);  // The area of the shape is: 12.0
    }
}
