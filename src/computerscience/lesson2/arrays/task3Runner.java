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
        int[][] sortArray = splitArray(array);
        System.out.println(Arrays.deepToString(sortArray));


    }

    private static int[][] splitArray(int[] array) {
        int[] positiveArray = new int[countPositiveNum(array)];
        int[] negativeArray = new int[countNegativeNum(array)];
        int[] zeroArray = new int[countZeroNum(array)];
        int[][] resultArray = new int[][]{positiveArray, negativeArray, zeroArray};

        int indexPositiveNum = 0;
        int indexNegativeNum = 0;
        int indexZeroNum = 0;

        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex] > 0) {
                resultArray[0][indexPositiveNum++] = array[currentIndex];
            } else if (array[currentIndex] < 0) {
                resultArray[1][indexNegativeNum++] = array[currentIndex];
            } else if (array[currentIndex] == 0) {
                resultArray[2][indexZeroNum++] = array[currentIndex];
            }
        }
        return resultArray;
    }

    private static int countPositiveNum(int[] array) {
        int count = 0;
        for (int vault : array) {
            if (vault > 0) {
                count++;
            }
        }
        return count;
    }

    private static int countNegativeNum(int[] array) {
        int count = 0;
        for (int vault : array) {
            if (vault < 0) {
                count++;
            }
        }
        return count;
    }

    private static int countZeroNum(int[] array) {
        int count = 0;
        for (int vault : array) {
            if (vault == 0) {
                count++;
            }
        }
        return count;
    }

}
