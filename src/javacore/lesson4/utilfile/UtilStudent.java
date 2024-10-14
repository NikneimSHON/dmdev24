package javacore.lesson4.utilfile;

import javacore.lesson4.enumfile.UniversityCourse;
import javacore.lesson4.student.Student;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * -Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * -Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * -Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public final class UtilStudent {

    private UtilStudent() {

    }

    public static HashMap<UniversityCourse, Double> listTransformationOne(List<Student> students) {
        return (HashMap<UniversityCourse, Double>) students.stream()
                .filter(student -> student.getAssessment().size() > 3)
                .collect(Collectors.toMap(Student::getUniversityCourse, student -> student.getAssessment().stream()
                        .mapToDouble(Double::doubleValue).average().orElse(0.0), (oldAverage, newAverage) -> (oldAverage + newAverage) / 2));
    }

    public static HashMap<UniversityCourse, List<Map<String, String>>> listTransformationTwo(List<Student> students) {
        Map<UniversityCourse, List<Map<String, String>>> courseMap = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getUniversityCourse,
                        Collectors.mapping(student -> {
                            Map<String, String> studentInfo = new HashMap<>();
                            studentInfo.put("Имя", student.getFirstName());
                            studentInfo.put("Фамилия", student.getLastName());
                            return studentInfo;
                        }, Collectors.toList())
                ));
        courseMap.forEach((courseNumber, studentList) ->
                studentList.sort(Comparator.comparing((Map<String, String> s) -> s.get("Имя"))
                        .thenComparing(s -> s.get("Фамилия"))));

        return (HashMap<UniversityCourse, List<Map<String, String>>>) courseMap;
    }

    public static HashMap<UniversityCourse, Map<List<Map<String, String>>, Double>> listTransformationThree(List<Student> students) {
        Map<UniversityCourse, Map<List<Map<String, String>>, Double>> courseMap = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName)
                        .thenComparing(Student::getLastName))
                .collect(Collectors.groupingBy(
                        Student::getUniversityCourse,
                        Collectors.collectingAndThen(
                                Collectors.mapping(student -> {
                                    Map<String, String> studentInfo = new HashMap<>();
                                    studentInfo.put("Имя", student.getFirstName());
                                    studentInfo.put("Фамилия", student.getLastName());
                                    return studentInfo;
                                }, Collectors.toList()),
                                studentInfos -> {

                                    double averageGrade = studentInfos.stream()
                                            .flatMap(studentInfo -> students.stream()
                                                    .filter(student -> student.getFirstName().equals(studentInfo.get("Имя"))
                                                            && student.getLastName().equals(studentInfo.get("Фамилия")))
                                                    .flatMap(student -> student.getAssessment().stream())
                                            )
                                            .mapToDouble(s -> s)
                                            .average()
                                            .orElse(0.0);

                                    Map<List<Map<String, String>>, Double> resultMap = new HashMap<>();
                                    resultMap.put(studentInfos, averageGrade);
                                    return resultMap;
                                }
                        )
                ));

        return (HashMap<UniversityCourse, Map<List<Map<String, String>>, Double>>) courseMap;

    }
}
