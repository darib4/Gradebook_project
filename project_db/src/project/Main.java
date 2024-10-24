package project;

public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        // Създаване на преподаватели
        Teacher teacher1 = new Teacher("Иван Иванов", "Математика");
        Teacher teacher2 = new Teacher("Петя Петрова", "Информатика");

        gradeBook.addTeacher(teacher1);
        gradeBook.addTeacher(teacher2);

        // Създаване на студенти
        Student student1 = new Student("Валентин", "Василев");
        Student student2 = new Student("Иван", "Иванов");

        gradeBook.addStudent(student1);
        gradeBook.addStudent(student2);

        // Създаване на курсове
        Course mathCourse = new Course("Математика");
        Course informaticsCourse = new Course("Информатика");

        gradeBook.createCourse(mathCourse);
        gradeBook.createCourse(informaticsCourse);

        // Записване на студентите в курсове
        gradeBook.enrollStudentInCourse(student1, mathCourse);
        gradeBook.enrollStudentInCourse(student1, informaticsCourse);
        gradeBook.enrollStudentInCourse(student2, mathCourse);

        // Добавяне на оценки за студентите
        gradeBook.addGradeToStudent(student1, new Grade(6, teacher1, "Математика"));
        gradeBook.addGradeToStudent(student1, new Grade(5, teacher2, "Информатика"));
        gradeBook.addGradeToStudent(student2, new Grade(4, teacher1, "Математика"));

        // Показване на резултатите
        gradeBook.showStudents();
        gradeBook.showCourses();
        gradeBook.showGradesForStudent(student1);
        gradeBook.showGradesForStudent(student2);
    }
}
