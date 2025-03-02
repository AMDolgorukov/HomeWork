import java.util.Date;

public class Product {
    private String name;
    private Date productionDate;        //Просто предположил, что уже есть какой то патерн для записи даты, загуглил, выбрал самый простой
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean reservationStatus;

    public Product(String name, Date productionDate, String manufacturer, String countryOfOrigin, int price, boolean reservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.reservationStatus = reservationStatus;
    }

    public void info() {
        System.out.println("Наименование: " + name
                + "\nДата производства: " + productionDate.getDate() + "." + productionDate.getMonth() + "." + (productionDate.getYear())
                + "\nПроизводитель: " + manufacturer
                + "\nСтрана происхождения: " + countryOfOrigin
                + "\nЦена: " + price / 100 + " рублей " + price % 100 + " копеек"
        );
        if (reservationStatus) {
            System.out.println("Состояние бронирования: Забронировано\n");
        } else {
            System.out.println("Состояние бронирования: Не забронировано\n");
        }
    }
}
