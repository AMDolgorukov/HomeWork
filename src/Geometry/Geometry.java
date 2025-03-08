package Geometry;

public class Geometry {
    public static void main(String[] args) {
        Circle circle = new Circle("Красный","Желтый",5);
        Rectangle rectangle = new Rectangle("Синий","Зеленый",3,4);
        Triangle triangle = new Triangle("Красный","Синий",2,3,4);

        circle.getFullInformation();
        rectangle.getFullInformation();
        triangle.getFullInformation();
    }
}
