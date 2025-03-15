package TelephoneDirectory;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Вицин", 89876543210L);
        phoneDirectory.add("Никулин", 88002000500L);
        phoneDirectory.add("Моргунов", 89999999999L);
        phoneDirectory.add("Никулин", 88992111543L);
        phoneDirectory.add("Моргунов", 89988776655L);

        phoneDirectory.get("Вицин");
        phoneDirectory.get("Никулин");
        phoneDirectory.get("Моргунов");
    }
}