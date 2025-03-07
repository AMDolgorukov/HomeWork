public class Dog extends Animal {
    public static int dogNumber = 0;

    @Override
    public void run(int r) {
        if (r > 0) {
            if (r <= 500) {
                System.out.println(getName() + " пробежал(а) " + r + " метров");
            } else System.out.println(getName() + " не пробежит " + r + " метров");
        } else System.out.println("Дистанция забега должна быть больше нуля");
    }

    @Override
    public void swim(int s) {
        if (s > 0) {
            if (s <= 10) {
                System.out.println(getName() + " проплыл(а) " + s + " метров");
            } else System.out.println(getName() + " не проплывет " + s + " метров");
        } else System.out.println("Дистанция заплыва должна быть больше нуля");
    }

    public Dog(String name) {
        super(name);
        dogNumber++;
    }
}
