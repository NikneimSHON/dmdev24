package javacore.lesson1.task1;

import javacore.lesson1.task1.structure.Flat;
import javacore.lesson1.task1.structure.Floor;
import javacore.lesson1.task1.structure.Home;
import javacore.lesson1.task1.structure.Room;

import javax.swing.tree.RowMapper;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив)
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах,
 * квартирах и комнатах, вызывая методы print.
 */
public class StructureManager {
    public static void main(String[] args) {
        Home home = new Home(3,10);
        printAllInformation(home);

    }

    private static void printAllInformation(Home home){
        home.printInformation();
        for(int floorIndex = 0;floorIndex < home.getFloors().length; floorIndex++){
            System.out.println("-------------------------------------");
            home.getFloors()[floorIndex].printInformation();
            for(int flatIndex = 0;flatIndex<home.getFloors()[floorIndex].getFlats().length;flatIndex++){
                home.getFloors()[floorIndex].getFlats()[flatIndex].printInformation();
                for(int roomIndex = 0;roomIndex<home.getFloors()[floorIndex].getFlats()[flatIndex].getRooms().length;roomIndex++){
                    home.getFloors()[floorIndex].getFlats()[flatIndex].getRooms()[roomIndex].printInformation();
                }

            }
        }
    }




}
