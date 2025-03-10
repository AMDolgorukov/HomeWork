package Animals;

public class Dog extends Animal {
    public static int dogNumber = 0;

    @Override
    public void run(int run) {
        if (run > 0) {
            if (run <= 500) {
                System.out.println(getName() + " пробежал(а) " + run + " м");
            } else System.out.println(getName() + " не пробежит " + run + " м");
        } else System.out.println("Дистанция забега должна быть больше нуля");
    }

    @Override
    public void swim(int swim) {
        if (swim > 0) {
            if (swim <= 10) {
                System.out.println(getName() + " проплыл(а) " + swim + " м");
            } else System.out.println(getName() + " не проплывет " + swim + " м");
        } else System.out.println("Дистанция заплыва должна быть больше нуля");
    }

    public Dog(String name) {
        super(name);
        dogNumber++;
    }
}
