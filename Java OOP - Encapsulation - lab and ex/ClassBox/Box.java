package EncapsulationSoftUni.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private void setLength(double length) {
        this.length = length;
        if(length<=0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }

    }

    private void setWidth(double width) {
        this.width = width;
        if(width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }

    }

    private void setHeight(double height) {
        this.height = height;
        if(height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }

    }

    public double calculateSurfaceArea(){

        return ((2*this.length*this.width)+(2*this.length*this.height)+(2*this.width*this.height));
    }

    public double calculateLateralSurfaceArea(){

        return ((2*this.length*this.height)+(2*this.width*this.height));
    }

    public double calculateVolume(){

        return (this.length*this.width*this.height);
    }


}
