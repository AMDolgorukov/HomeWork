package Animals;

public abstract class Animal {
    private final String name;
    public static int animalNumber;

    public abstract void run(int run);

    public abstract void swim(int swim);

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
        animalNumber++;
    }
}