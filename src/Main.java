public class Main {
    public static void main(String[] args) {
        String[][] strArrOk = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] strArrOverSize = {{"1", "2", "3", "4", "111"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] strArrInvalid = {{"1", "2", "3", "4"}, {"пять", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        try {
            System.out.println("\n1) Правильный массив");
            int sum = offRoadArr(strArrOk);
            System.out.println(sum);
        } catch (MyArraySizeException e) {
            System.out.println("Массив недопустимого размера");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n2) Массив большего размера");
            int sum = offRoadArr(strArrOverSize);
            System.out.println(sum);
        } catch (MyArraySizeException e) {
            System.out.println("Массив недопустимого размера");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n3) Массив с текстом");
            int sum = offRoadArr(strArrInvalid);
            System.out.println(sum);
        } catch (MyArraySizeException e) {
            System.out.println("Массив недопустимого размера");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n4) Этот индекс, которого нет...");
            String sumStr = strArrOk[3][7];
            System.out.println(sumStr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такой ячейки нет в массиве\n");
        }
    }

    public static int offRoadArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Массив недопустимого размера");
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Массив недопустимого размера");
            }
        }
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                try {
                    sum += Integer.parseInt(arr[j][i]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Недопустимое значение '" + arr[j][i] + "' в ячейке [" + j + "][" + i + "]");
                }
            }
        }
        System.out.print("Сумма элементов массива: ");
        return sum;
    }
}