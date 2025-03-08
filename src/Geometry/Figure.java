package Geometry;

public interface Figure {
    public double perimeter();

    public double square();

    public String getLabel();

    public String getBackgroundColor();

    public String getBorderColor();

    public default void getFullInformation() {
        System.out.println("Фигура: "+getLabel()+
                "\nЦвет заливки: "+getBackgroundColor()+
                "\nЦвет границ: "+getBorderColor()+
                "\nПериметр(Окружность): "+perimeter()+
                "\nПлощадь: "+square()+"\n");
    }
}