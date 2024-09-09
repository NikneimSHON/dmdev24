package computerscience.lesson1;
//Даны два прямоугольных треугольника.
//Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
//Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
//
//Для этого понадобится написать 2 функции.
//Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
//Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
//Учитывать, что площадь может быть вещественным числом.

import java.util.Scanner;

public class task3Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите сторону a для первого треугольника ");
        int a1 = scan.nextInt();

        System.out.println("Введите сторону b для первого треугольника ");
        int b1 = scan.nextInt();

        System.out.println("Введите сторону a для второго треугольника ");
        int a2 = scan.nextInt();

        System.out.println("Введите сторону b для второго треугольника ");
        int b2 = scan.nextInt();

        comparisonAreas(areaTriangle(a1, b1), areaTriangle(a2, b2));


    }

    private static void comparisonAreas(double area1, double area2) {
        if (area1 > area2) {
            System.out.println("Площадь первого треугольника больше " + area1 + " > " + area2);
        } else if (area1 < area2) {
            System.out.println("Площадь второго треугольника больше " + area1 + " < " + area2);
        } else {
            System.out.println("Площадь треугольников равна" + area1 + " = " + area2);
        }
    }

    private static double areaTriangle(double side1, double side2) {
        return side1 * side2 * 0.5;
    }
}
