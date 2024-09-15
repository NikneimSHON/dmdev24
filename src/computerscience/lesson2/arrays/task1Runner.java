package computerscience.lesson2.arrays;

import java.util.Arrays;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class task1Runner {
    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};
        System.out.println(Arrays.toString(positiveArray(array)));

    }

    private static int[] positiveArray(int[] array) {
        int lenChangedArray = lengthPositiveArray(array);
        int indexChangedArray = 0;

        int[] changedArray = new int[lenChangedArray];


        for (int vault : array) {
            if (vault >= 0) {
                changedArray[indexChangedArray++] = vault*lenChangedArray;
            }
        }

        return changedArray;
    }

    private static int lengthPositiveArray(int[] array) {
        int count = 0;
        for (int vault : array) {
            if (vault >= 0) {
                count++;
            }
        }
        return count;
    }
}
