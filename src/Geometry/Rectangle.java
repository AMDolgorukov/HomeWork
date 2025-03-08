package Geometry;

public class Rectangle implements Figure {
    private static final String label = "Прямоугольник";
    double sideA,sideB;
    String backGroundColor;
    String borderColor;

    public double perimeter() {
        return (sideA+sideB)*2;
    }

    public double square() {
        return sideA*sideB;
    }

    public String getLabel(){
        return label;
    }

    public String getBackgroundColor() {
        return backGroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public Rectangle(String backGroundColor,String borderColor, double sideA, double sideB){
        this.backGroundColor = backGroundColor;
        this.borderColor = borderColor;
        this.sideA =sideA;
        this.sideB =sideB;
    }
}