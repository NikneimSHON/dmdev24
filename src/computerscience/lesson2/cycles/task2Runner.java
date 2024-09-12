package computerscience.lesson2.cycles;

/**
 * Задание 2
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class task2Runner {
    public static void main(String[] args) {
        int number = reverseNumber(-1234567);
        System.out.println(number);


    }

    private static int reverseNumber(int number) {
        int result = 0;
        for (int currentValue = Math.abs(number); currentValue > 0; currentValue /= 10) {
            result *= 10;
            result += currentValue % 10;
        }
        return ((number > 0) ? result : result * -1);

    }

}

