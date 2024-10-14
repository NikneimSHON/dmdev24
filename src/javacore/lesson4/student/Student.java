package javacore.lesson4.student;

import javacore.lesson4.enumfile.UniversityCourse;

import java.util.List;
import java.util.Objects;

public class Student {
    String firstName;
    String lastName;
    UniversityCourse universityCourse;
    List<Double> assessment;

    public Student(String firstName, String lastName, UniversityCourse universityCourse, List<Double> assessmentList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.universityCourse = universityCourse;
        this.assessment = assessmentList;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UniversityCourse getUniversityCourse() {
        return universityCourse;
    }

    public void setUniversityCourse(UniversityCourse universityCourse) {
        this.universityCourse = universityCourse;
    }

    public List<Double> getAssessment() {
        return assessment;
    }

    public void setAssessment(List<Double> assessment) {
        this.assessment = assessment;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && universityCourse == student.universityCourse && Objects.equals(assessment, student.assessment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, universityCourse, assessment);
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
