public class Park {
    private String name;
    private String address;
    private String owner;
    private String inn;
    private long authorizedCapital;
    private Visitors visitors;

    public static class Visitors {
        private String attraction;
        private int price;
        private String openingHours;

        public Visitors(String attraction, int price, String openingHours) {
            this.attraction = attraction;
            this.price = price;
            this.openingHours = openingHours;
        }

    }

    public Park(String name, String address, String owner, String inn, long authorizedCapital, Visitors visitors) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.inn = inn;
        this.authorizedCapital = authorizedCapital;
        this.visitors = visitors;
    }

    public void info() {
        System.out.println("Атракцион: " + visitors.attraction + "\nГрафик работы: " + visitors.openingHours + "\nСтоимость: " + visitors.price / 100 + " рублей " + visitors.price % 100 + " копеек");
    }
}
