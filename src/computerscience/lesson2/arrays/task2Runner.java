package computerscience.lesson2.arrays;

import java.util.Arrays;

/**
 * ﻿Задание 2
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и
 * вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class task2Runner {
    public static void main(String[] args) {
        char[] charArray = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};

        int[] numberArray = changedArray(charArray);
        System.out.println(Arrays.toString(numberArray));

        double averageNumber = arithmeticAverage(numberArray);
        printMoreAverage(numberArray, averageNumber);


    }

    private static int[] changedArray(char[] charArray) {
        int[] numberArray = new int[charArray.length];

        for (int currentIndex = 0; currentIndex < charArray.length; currentIndex++) {
            numberArray[currentIndex] = (int) charArray[currentIndex];
        }
        return numberArray;
    }

    private static double arithmeticAverage(int[] numberArray) {
        int sum = 0;
        for (int vault : numberArray) {
            sum += vault;
        }
        return ((double) sum / numberArray.length);
    }

    private static void printMoreAverage(int[] array, double averageNumber) {
        for (int vault : array) {
            if (vault > averageNumber) {
                System.out.print(vault + " ");
            }
        }
    }

}
