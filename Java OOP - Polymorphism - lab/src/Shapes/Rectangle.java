package Shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        super.setArea(getArea());
        super.setPerimeter(getPerimeter());
    }


    @Override
    public Double calculatePerimeter() {
        return 2*height + 2*width;
    }

    @Override
    public Double calculateArea() {
        return height*width;
    }
}
