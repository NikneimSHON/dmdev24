package computerscience.lesson1;

//Даны 3 переменные:
//
//- operand1 (double)
//- operand2 (double)
//- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
//
//Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
//Протестировать функцию в main.
//
//Например:
//Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
//Результат: 34.5 (24.4 + 10.1)
public class task2Runner {
    private final static char ADDITION = '+';
    private final static char SUBTRACTION = '-';
    private final static char MULTIPLICATION = '*';
    private final static char DIVISION = '/';
    private final static char MODULUS = '%';

    public static void main(String[] args) {
        double operand1 = 10;
        double operand2 = 2;
        System.out.println(calculate(operand1,operand2,DIVISION));

    }
    private static double calculate(double operand1, double operand2, char operation) {
        return switch (operation) {
            case ADDITION -> addition(operand1, operand2);
            case SUBTRACTION -> subtraction(operand1, operand2);
            case MULTIPLICATION -> multiplication(operand1, operand2);
            case DIVISION -> division(operand1, operand2);
            case MODULUS -> modulus(operand1,  operand2);
            default -> throw new IllegalArgumentException("Invalid mathematical operation");
        };
    }

    private static double addition(double operand1, double operand2) {
        return operand1 + operand2;

    }

    private static double subtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }

    private static double multiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }

    private static double division(double operand1, double operand2) {
        return operand1 / operand2;
    }

    private static double modulus(double operand1, double operand2) {
        return operand1 % operand2;
    }

}
