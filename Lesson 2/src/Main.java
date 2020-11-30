import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//      1. Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0;


//      2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] numbers2 = new int[8];
        int increase = 0;
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = increase;
            increase = increase + 3;
        }
        System.out.println(Arrays.toString(numbers2));
        System.out.println("\n");

//      3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] numbers3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] < 6) {
                numbers3[i] = numbers3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(numbers3));
        System.out.println("\n");

//      4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("\n");

//      5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] numbers4 = new int[10];
        int max = 0;
        int min = 50;

        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = new Random().nextInt(50);
        }
        System.out.println(Arrays.toString(numbers4));

        for (int i = 0; i < numbers4.length; i++) {
            if (numbers4[i] > max) {
                max = numbers4[i];
            } else if (numbers4[i] < min) {
                min = numbers4[i];
            }
        }
        System.out.println("Макс цифра из массива: " + max + ". Минимальная: " + min);
//      Интернетом не пользовался, честно) просто сравнил все элементы между собой
        System.out.println("\n");

//      6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        int[] numbers5 = new int[10];
        for (int i = 0; i < numbers5.length; i++) {
            numbers5[i] = new Random().nextInt(5);
        }
        System.out.println(Arrays.toString(numbers5));
        System.out.println(checkBalance1(numbers5));
        System.out.println("\n");

//      7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//        int[] numbers6 = new int[10];
//        for (int i = 0; i < numbers6.length; i++) {
//            numbers6[i] = new Random().nextInt(5);
//        }
        int step = 3;
        int[] numbers6 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        moveArrElement(numbers6, step);
        System.out.println("\n");
        moveArrElementStep(numbers6, step);

    }



    static boolean checkBalance1(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum = leftSum + numbers[j];
            }
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum = rightSum + numbers[k];
            }
            if (leftSum == rightSum) {
                StringBuilder out = new StringBuilder();
                for (int c = 0; c < numbers.length; c++) {
                    out.append("[").append(numbers[c]).append("]");
                    if (c == i) {
                        out.append(" || ");
                    }
                }
                System.out.println(out);
                return true;
            }
        }
        return false;
    }

    static void moveArrElement(int[] numbers, int n) {
        System.out.println("Первый массив: " + Arrays.toString(numbers));
        int[] newArray = new int[numbers.length];
        if (n >= 0) {
            for (int i = 0; i < numbers.length - n; i++) {
                newArray[n + i] = numbers[i];
            }
            int j = numbers.length - n;
            for (int i = 0; i < n; i++) {
                newArray[i] = numbers[j];
                j++;
            }
        } else if (n < 0) {
            n = -n;
            for (int i = 0; i < numbers.length - n; i++) {
                newArray[i] = numbers[n + i];
            }
            int j = numbers.length - n;
            for (int i = 0; i < n; i++) {
                newArray[j] = numbers[i];
                j++;
            }
        }
        System.out.println("n = " + n);
        System.out.println("Новый массив " + Arrays.toString(newArray));

    }

    static void moveArrElementStep(int[] numbers, int n) {
        System.out.println("Массив: " + Arrays.toString(numbers));
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                int y = numbers[numbers.length - 1];
                for (int j = 1; j <= numbers.length - 1; j++) {
                    numbers[numbers.length - j] = numbers[numbers.length - (j + 1)];
                }
                numbers[0] = y;
            }
        } else {
            n = -n;
            for (int i = 0; i < n; i++) {
                int y = numbers[0];
                for (int j = 0; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                numbers[numbers.length - 1] = y;
            }
        }
        System.out.println("Отредактированный массив: " + Arrays.toString(numbers));
    }
}