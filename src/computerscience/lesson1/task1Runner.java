package computerscience.lesson1;

import java.util.Scanner;

//Задание 1
//
//В переменной minutes лежит число от 0 до 59.
//Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
//в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
//
//Протестировать функцию в main.
public class task1Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время");
        int minutes = scan.nextInt();
        if(isMinutesValid(minutes)){
            isQuarterHour(minutes);
        }
        else{
            System.out.println("Not a valid minutes");
        }

    }

    private static void isQuarterHour(int minutes) {
        if (minutes <= 15) {
            System.out.println("The first part of the hour");
        } else if (minutes <= 30) {
            System.out.println("The second part of the hour");
        } else if (minutes <= 45) {
            System.out.println("The third part of the hour");
        } else {
            System.out.println("The fourth part of the hour");
        }
    }

    private static boolean isMinutesValid(int minutes) {
        return minutes >= 0 && minutes <= 59;
    }
}
