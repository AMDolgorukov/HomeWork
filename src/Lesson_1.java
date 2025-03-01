import java.util.Arrays;

public class Lesson_1 {
    public static void main(String[] args) {

        /* 1 */
        printThreeWords();
        /* 2 */
        checkSumSign();
        /* 3 */
        printColor();
        /* 4 */
        compareNumbers();
        /* 5 */
        System.out.println(checkSumRange(7, 8) + "\n");
        /* 6 */
        checkPositiveNumbers(3);
        /* 7 */
        System.out.println(checkNegativeNumbers(5) + "\n");
        /* 8 */
        repeatStringPrint("По полям, по полям, синий трактор едет к нам", 4);
        /* 9 */
        System.out.println(leapYear(1800) + "\n");
        /* 10 */
        int[] binaryArr = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0};
        System.out.println(Arrays.toString(inverseBinaryArr(binaryArr)) + "\n");
        /* 11 */
        int[] hundredArr = new int[100];
        System.out.println(Arrays.toString(fillHundredArr(hundredArr)) + "\n");
        /* 12 */
        int[] exerciseTwelveArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(boostExerciseTwelveArr(exerciseTwelveArr)) + "\n");
        /* 13 */
        int[][] matrix = new int[13][13];
        for (int i = 0; i < matrixReload(matrix).length; i++) {
            System.out.println(Arrays.toString(matrixReload(matrix)[i]));
        }
        /* 14 */
        System.out.println("\n" + Arrays.toString(initialValueArr(5, 6)));

    }

    //  Задание 1
    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    // Задание 2
    private static void checkSumSign() {
        int a = 10;
        int b = -11;
        if ((a + b) >= 0) {
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

    //Задание 5
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

    //Задание 7
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
    private static boolean leapYear(int y) {
        return ((y % 400) == 0) || ((y % 4) == 0) & !((y % 100) == 0);
    }

    //Задание 10
    private static int[] inverseBinaryArr(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 0) {
                myArr[i] = 1;
            } else myArr[i] = 0;
        }
        return myArr;
    }

    //Задание 11
    private static int[] fillHundredArr(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }

    //Задание 12
    private static int[] boostExerciseTwelveArr(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < 6) {
                myArr[i] *= 2;
            }
        }
        return myArr;
    }

    //Задание 13
    private static int[][] matrixReload(int[][] myMatrix) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if ((j == i) || ((myMatrix.length - j - 1) == i)) {
                    myMatrix[i][j] = 1;
                } else myMatrix[i][j] = 0;
            }
        }
        return myMatrix;
    }

    //Альтрнативный вариант выполнения задания: Метод принимает только размер "стороны квадрата" массива. При вызове метода, в консоль выводится двумерный массив требуемый по заданию

                /* private static void matrixReload(int size){
                     int[][] matrix = new int[size][size];
                     for (int i = 0; i < matrix.length; i++) {
                         for (int j = 0; j < matrix[i].length; j++) {
                             if ((j == i) || ((matrix.length - j -1) == i))  {
                                 matrix[i][j] = 1;
                             } else matrix[i][j] = 0;
                         }
                     }
                     for (int i = 0; i < matrixReload(matrix).length; i++) {
                         System.out.println(Arrays.toString(matrixReload(matrix)[i]));
                         }
                     } */

    //Задание 14
    private static int[] initialValueArr(int len, int initialValue) {
        int[] myArr = new int[len];
        Arrays.fill(myArr, initialValue);
        return myArr;
    }

}