package project;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private final List<Grade> grades;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        return grades.stream().mapToDouble(Grade::getValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return String.format("%s %s, Среден успех: %.2f", firstName, lastName, getAverageGrade());
    }
}
