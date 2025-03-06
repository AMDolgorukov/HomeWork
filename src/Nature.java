public class Nature {
    public static void main(String[] args) {
        Dog dogMuhtar = new Dog("Мухтар");
        Cat catBegimot = new Cat("Бегимот");
        Dog bim = new Dog("Белый Бим, черное ухо");
        Cat matroskin = new Cat("Матроскин");
        Dog sharik = new Dog("Шарик");
        Cat kompot = new Cat("Компот");
        Cat korzhik = new Cat("Коржик");
        Cat karamelka = new Cat("Карамелька");

        //Гоняем котов и собак
        dogMuhtar.run(1000);
        catBegimot.run(50);
        bim.run(499);
        matroskin.swim(1);
        sharik.swim(9);

        //Считаем котов и собак
        System.out.println("\nСобак: " + Dog.dogNumber + "\nКотов: " + Cat.catNumber + "\nВсего животных: " + Animal.animalNumber + "\n");

        //Кормим котов
        Cat.fillBowl(25);
        matroskin.eat();
        catBegimot.eat();

        System.out.println();

        //Массив котов
        Cat.fillBowl(59);
        Cat[] catCafe = {catBegimot, matroskin, korzhik, kompot, karamelka};
        for (Cat cat : catCafe) {
            cat.eat();
        }

        System.out.println();

        for (Cat cat : catCafe) {
            if (cat.satiety) {
                System.out.println(cat.getName() + " сыт");
            } else System.out.println(cat.getName() + " голоден(на)");
        }

    }

}