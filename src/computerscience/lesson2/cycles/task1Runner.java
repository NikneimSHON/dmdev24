package computerscience.lesson2.cycles;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class task1Runner {
    public static void main(String[] args) {
        System.out.println(evenNumbers(228910));
    }

    private static int evenNumbers(int number) {
        int count = 0;
        for (int currentValue = (number > 0 ? number : number * -1); currentValue > 0; currentValue /= 10) {
            if (currentValue % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int unEvenNumbers(int number) {
        int count = 0;
        for (int currentValue = (number > 0 ? number : number * -1); currentValue > 0; currentValue /= 10) {
            if (currentValue % 2 != 0) {
                count++;
            }
        }
        return count;
    }

}
