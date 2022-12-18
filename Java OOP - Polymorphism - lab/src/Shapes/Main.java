package Shapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(2.0,5.0);
        Shape shape1 = new Circle(12.0);

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.calculateArea());
        System.out.println(shape1.calculatePerimeter());
        System.out.println(shape1.calculateArea());

    }
}
