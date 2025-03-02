import java.util.Date;

public class Lesson_10 {
    public static void main(String[] args) {
        //Задание 1
        Product milk = new Product("Молоко", new Date(125, 1, 1), "Станция молочная", "Россия", 14000, true);
        milk.info();

        //Задание 2
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Yokohama Geolandar A/T", new Date(124, 6, 11), "Yokohama", "Япония", 1222000, false);
        productsArray[1] = new Product("BF GOODRICH Mud-Terrain T/A KM3", new Date(124, 3, 17), "BFGoodrich", "США", 4307000, true);
        productsArray[2] = new Product("Кама NU-704", new Date(124, 5, 25), "КАМА", "Россия", 6116300, false);
        productsArray[3] = new Product("Belshina ФБел-253М", new Date(124, 10, 4), "Belshina", "Беларусь", 1485000, true);
        productsArray[4] = new Product("Maxxis M8060 Trepador", new Date(124, 7, 9), "Maxxis", "Тайвань", 1222000, false);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].info();
        }

        //Задание 3
        Park park = new Park("Хогвардс", "Россия, Калужская область, Никола-Ленивец", "Генри Говард Холмс", "4815162342", 19953467800L, new Park.Visitors("Карусель", 20000, "9:00 - 18:00"));
        park.info();
    }
}
