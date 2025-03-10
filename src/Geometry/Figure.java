package Geometry;

public interface Figure {
    default double perimeter(double... sides) {
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum;
    }

    double square();

    String getLabel();

    String getBackgroundColor();

    String getBorderColor();
}