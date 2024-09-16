package computerscience.lesson2.arrays;

import java.util.Arrays;

/**
 * Задание 3
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 * [-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * [1, 9, 3]
 */
public class task3Runner {
    public static void main(String[] args) {
        int[] array = {-4, 0, 1, 9, 0, -18, 3};
        int[][] sortArray = createArray(array,calculateLengthOfArray(array));
        System.out.println(Arrays.deepToString(sortArray));


    }

    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] createArray(int[] array, int[][] arrayNew) {
        int negativeCount = 0;
        int positiveCount = 0;
        int nullCount = 0;
        for (int j : array) {
            if (j < 0) {
                arrayNew[0][negativeCount] = j;
                negativeCount++;
            } else if (j > 0) {
                arrayNew[1][positiveCount] = j;
                positiveCount++;
            } else {
                arrayNew[2][nullCount] = j;
                nullCount++;
            }
        }
        return arrayNew;
    }

    private static int[][] calculateLengthOfArray(int[] array) {
        int negativeCount = 0;
        int positiveCount = 0;
        int nullCount = 0;
        for (int j : array) {
            if (j < 0) {
                negativeCount++;
            } else if (j > 0) {
                positiveCount++;
            } else {
                nullCount++;
            }
        }
        int[][] arrayNew = new int[3][];
        arrayNew[0] = new int[negativeCount];
        arrayNew[1] = new int[positiveCount];
        arrayNew[2] = new int[nullCount];
        return arrayNew;
    }

}
