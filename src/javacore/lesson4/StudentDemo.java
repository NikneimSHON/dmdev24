package javacore.lesson4;

import javacore.lesson4.enumfile.UniversityCourse;
import javacore.lesson4.student.Student;
import javacore.lesson4.utilfile.UtilStudent;

import java.util.*;

public class StudentDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();


        students.add(new Student("Alice", "Smith", UniversityCourse.FIRST,new LinkedList<>(List.of(5.0,9.0,12.0,14.0))));
        students.add(new Student("Alice", "Johnson", UniversityCourse.FIRST,new LinkedList<>(List.of(12.0,4.0,3.0,1.0))));
        students.add(new Student("Charlie", "Williams", UniversityCourse.THIRD,new LinkedList<>(List.of(3.0,1.0,11.0,4.0))));
        students.add(new Student("David", "Brown", UniversityCourse.FOURTH,new LinkedList<>(List.of(8.0,6.0,6.0))));
        System.out.println(UtilStudent.listTransformationOne(students));
        System.out.println(UtilStudent.listTransformationTwo(students));
        System.out.println(UtilStudent.listTransformationThree(students));

    }
}
