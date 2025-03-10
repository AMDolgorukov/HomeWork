package Geometry;

public class Geometry {
    public static void main(String[] args) {
        Circle circle = new Circle("Красный", "Желтый", 5);
        Rectangle rectangle = new Rectangle("Синий", "Зеленый", 3, 4);
        Triangle triangle = new Triangle("Красный", "Синий", 2, 3, 4);

        System.out.println("Фигура: " + circle.getLabel() +
                "\nЦвет заливки: " + circle.getBackgroundColor() +
                "\nЦвет границ: " + circle.getBorderColor() +
                "\nПериметр(Окружность): " + circle.perimeter() +
                "\nПлощадь: " + circle.square() + "\n");

        System.out.println("Фигура: " + rectangle.getLabel() +
                "\nЦвет заливки: " + rectangle.getBackgroundColor() +
                "\nЦвет границ: " + rectangle.getBorderColor() +
                "\nПериметр(Окружность): " + rectangle.perimeter() +
                "\nПлощадь: " + rectangle.square() + "\n");

        System.out.println("Фигура: " + triangle.getLabel() +
                "\nЦвет заливки: " + triangle.getBackgroundColor() +
                "\nЦвет границ: " + triangle.getBorderColor() +
                "\nПериметр(Окружность): " + triangle.perimeter() +
                "\nПлощадь: " + triangle.square() + "\n");
    }
}
