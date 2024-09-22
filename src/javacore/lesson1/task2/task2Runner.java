package javacore.lesson1.task2;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class task2Runner {
    public static void main(String[] args) {
        String line = "abccc Cpddd Dio OsfWw";
        System.out.println(editLine(line));

    }

    private static String editLine(String line) {
        String replaceLine = line.replaceAll(" ", "");

        StringBuilder resultLine = new StringBuilder();
        resultLine.append(replaceLine.charAt(0));

        for (int indexLine = 0; indexLine < replaceLine.length(); indexLine++) {
            char lastChar = Character.toLowerCase(resultLine.charAt(resultLine.length() - 1));
            char currentChar = Character.toLowerCase(replaceLine.charAt(indexLine));

            if (lastChar != currentChar) {
                resultLine.append(replaceLine.charAt(indexLine));
            }
        }
        return resultLine.toString().toUpperCase();

    }

}
