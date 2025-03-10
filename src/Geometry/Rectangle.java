package Geometry;

public class Rectangle implements Figure {
    private static final String label = "Прямоугольник";
    double sideA, sideB;
    String backGroundColor;
    String borderColor;

    public double perimeter() {
        return Figure.super.perimeter(sideA, sideB, sideA, sideB);
    }

    @Override
    public double square() {
        return sideA * sideB;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getBackgroundColor() {
        return backGroundColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    public Rectangle(String backGroundColor, String borderColor, double sideA, double sideB) {
        this.backGroundColor = backGroundColor;
        this.borderColor = borderColor;
        this.sideA = sideA;
        this.sideB = sideB;
    }
}