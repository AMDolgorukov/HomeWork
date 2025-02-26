public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumRange(7, 8) + "\n");
        checkPositiveNumbers(3);
        System.out.println(checkNegativeNumbers(5) + "\n");
        repeatStringPrint("По полям, по полям, синий трактор едет к нам", 4);
        System.out.println(leapYear(1800));
    }


    //  Задание 1
    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    // Задание 2
    private static void checkSumSign() {
        int a = 10;
        int b = -11;
        int c = a + b;          /* В данном случае я дословно придерживаюсь текста задания. Но можно не инициализировать переменную с и сумировать a и b непосредственно в условии */
        if (c >= 0) {           /* if (a + b >= 0) */
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
        }
    }

    //Задание 3
    private static void printColor() {
        int value = 120;
        if (value <= 0) {
            System.out.println("Красный\n");
        } else if (value <= 100) {
            System.out.println("Желтый\n");
        } else {
            System.out.println("Зеленый\n");
        }
    }

    //Задание 4
    private static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b\n");
        } else {
            System.out.println("a < b\n");
        }
    }

    //Задание 5                         При выполнении задания исхожу из того что требуется именно метод возвращающий булево значение, а не текст в консоли
    private static boolean checkSumRange(int a, int b) {
        int c = a + b;
        return (c >= 10) & (c <= 20);
    }

    //Задание 6
    private static void checkPositiveNumbers(int a) {
        if (a >= 0) {
            System.out.println("Число положительное\n");
        } else {
            System.out.println("Число отрицательное\n");
        }
    }

    //Задание 7                         Аналогично с заданием 5, метод возращает требуемое булево значение
    private static boolean checkNegativeNumbers(int b) {
        return b < 0;
    }

    //Задание 8
    private static void repeatStringPrint(String s, int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(s);
        }
        System.out.print("\n");
    }

    //Задание 9
    private static boolean leapYear(int y){
        return ((y % 400) == 0) || ((y % 4) == 0) & !((y % 100) == 0);
    }

}