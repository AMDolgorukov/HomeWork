package Geometry;

public class Triangle implements Figure {
    private static final String label = "Треугольник";
    double sideA,sideB,sideC;
    String backGroundColor;
    String borderColor;

    public double perimeter() {
        return sideA+sideB+sideC;
    }

    public double square() {
        double p=perimeter()/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
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

    public Triangle(String backGroundColor,String borderColor, double sideA, double sideB, double sideC){
        this.backGroundColor = backGroundColor;
        this.borderColor = borderColor;
        this.sideA =sideA;
        this.sideB =sideB;
        this.sideC =sideC;
    }
}