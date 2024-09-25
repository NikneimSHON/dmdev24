package javacore.lesson1.task3;
/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class task3Runner {
    public static void main(String[] args) {
        String line = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] ArrayNumber = createNumberArray(line);
        int sumArray = sumArrayNumber(ArrayNumber);
        System.out.println(sumArray);

    }

    private static int[] createNumberArray(String line) {
        StringBuilder builder = new StringBuilder();
        for (int indexLine = 0; indexLine < line.length(); indexLine++) {
            if (Character.isDigit(line.charAt(indexLine))) {
                builder.append(line.charAt(indexLine));
            }
        }

        int[] resultArray = new int[builder.length()];
        for (int indexLine = 0; indexLine < resultArray.length; indexLine++) {
            resultArray[indexLine] = Integer.parseInt(String.valueOf(builder.charAt(indexLine)));
        }
        return resultArray;

    }

    private static int sumArrayNumber(int[] array) {
        int sum = 0;
        for (int vault : array) {
            sum += vault;
        }
        return sum;
    }

}
