package Geometry;

public class Circle implements Figure {
    private static final String label = "Круг";
    double radius;
    String backGroundColor;
    String borderColor;

    @Override
    public String getLabel() {
        return label;
    }

    public double perimeter() {
        return radius * Math.PI * 2;
    }

    @Override
    public double square() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String getBackgroundColor() {
        return backGroundColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    public Circle(String backGroundColor, String borderColor, int radius) {
        this.backGroundColor = backGroundColor;
        this.borderColor = borderColor;
        this.radius = radius;
    }
}