public abstract class Animal {
    private String name;
    public static int animalNumber;

    public abstract void run(int r);

    public abstract void swim(int s);

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
        animalNumber++;
    }
}
