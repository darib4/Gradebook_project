package project;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private final List<Student> students;
    private final List<Teacher> teachers;
    private final List<Course> courses;

    public GradeBook() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void createCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(Student student, Course course) {
        if (courses.contains(course)) {
            student.enrollInCourse(course.getName());
        } else {
            System.out.println("Курсът не съществува.");
        }
    }

    public void unenrollStudentFromCourse(Student student, Course course) {
        student.unenrollFromCourse(course.getName());
    }

    public void addGradeToStudent(Student student, Grade grade) {
        if (student.isEnrolledInCourse(grade.getSubject())) {
            student.addGrade(grade);
        } else {
            System.out.println("Ученикът не е записан в този предмет и не може да получи оценка.");
        }
    }

    public void showStudents() {
        students.forEach(System.out::println);
    }

    public void showTeachers() {
        teachers.forEach(System.out::println);
    }

    public void showCourses() {
        courses.forEach(System.out::println);
    }

    public void showGradesForStudent(Student student) {
        System.out.printf("Оценки на %s %s:%n", student.getFirstName(), student.getLastName());
        student.getGrades().forEach(System.out::println);
    }
}
