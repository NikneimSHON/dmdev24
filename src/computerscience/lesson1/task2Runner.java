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
    public static void main(String[] args) {
        double operand1 = 10;
        double operand2 = 15;
        char operation = '*';

        double result;

        if (!checkValidOperation(operand2, operation)) {
            result = isCalculator(operand1, operand2, operation);
            System.out.println(operand1 + " " + operation + " " + operand2 + "  =  " + result);
        }
        else {
            System.out.println("Данные не корректны");
        }
    }

    public static double isCalculator(double operand1, double operand2, char operation) {
        double result = 0;
        if (operation == '+') {
            result = operand1 + operand2;
        } else if (operation == '-') {
            result = operand1 - operand2;
        } else if (operation == '*') {
            result = operand1 * operand2;
        } else if (operation == '/') {
            result = operand1 / operand2;
        } else if (operation == '%') {
            result = operand1 % operand2;
        }
        return result;
    }

    public static boolean checkValidOperation(double operand2, char operation) {
        return (operand2 == 0 && operation == '/') || (operand2 == 0 && operation == '%');

    }
}
