interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Q4DrawableDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();  // Drawing a circle.

        Rectangle rectangle = new Rectangle();
        rectangle.draw();  // Drawing a rectangle.
    }
}
