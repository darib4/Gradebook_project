package project;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private final List<Student> students;
    private final List<Teacher> teachers;

    public GradeBook() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addGradeToStudent(Student student, Grade grade) { // Тук поправяме от Grades на Grade
        student.addGrade(grade);
    }

    public void showStudents() {
        students.forEach(System.out::println);
    }

    public void showTeachers() {
        teachers.forEach(System.out::println);
    }

    public void showGradesForStudent(Student student) {
        System.out.printf("Оценки на %s %s:%n", student.getFirstName(), student.getLastName());
        student.getGrades().forEach(System.out::println);
    }
}


