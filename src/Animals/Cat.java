package Animals;

public class Cat extends Animal {
    public static int catNumber = 0;
    public static int bowl = 10;
    public boolean satiety = false;

    @Override
    public void run(int run) {
        if (run > 0) {
            if (run <= 200) {
                System.out.println(getName() + " пробежал(а) " + run + " м");
            } else System.out.println(getName() + " не пробежит " + run + " м");
        } else System.out.println("Дистанция забега должна быть больше нуля");
    }

    @Override
    public void swim(int swim) {
        System.out.println(getName() + " не умеет плавать");
    }

    public void eat() {
        if (!satiety) {
            if (bowl >= 20) {
                bowl -= 20;
                satiety = true;
                System.out.println(getName() + " покушал(а) и теперь доволен(а)");
            } else System.out.println("Недостаточно еды в миске, " + getName() + " расстроен(а)");
        } else System.out.println(getName() + " сыт(а)");
    }

    public static void fillBowl(int a) {
        if (bowl + a < 100) {
            bowl += a;
        } else bowl = 100;
        System.out.println("Миска заполненна на " + bowl + " ед.");
    }

    public Cat(String name) {
        super(name);
        catNumber++;
    }
}
