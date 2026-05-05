abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double r = 5;

    void area() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    int l = 4, b = 3;

    void area() {
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}