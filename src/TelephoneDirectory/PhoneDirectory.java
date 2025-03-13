package TelephoneDirectory;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    HashMap<Long, String> book = new HashMap<>();

    public void add(String subscriber, Long number) {
        this.book.put(number, subscriber);
    }

    public void get(String subscriber) {
        System.out.println("\nНа фамилию " + subscriber + " зарегестрированны следующие номера: ");
        for (Map.Entry<Long, String> entry : book.entrySet()) {
            if (entry.getValue().equals(subscriber)) {
                System.out.println(entry.getKey());
            }
        }
    }
}