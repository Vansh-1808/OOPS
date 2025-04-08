abstract class Shape {
    abstract double calculateArea(); // Abstract method
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(double w, double h) { width = w; height = h; }
    double calculateArea() {
        return width * height;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.calculateArea());     // Output: Circle Area: 78.539...
        circle.display();                                                // Output: This is a shape
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: Rectangle Area: 24.0
        rectangle.display();                                             // Output: This is a shape
    }
}