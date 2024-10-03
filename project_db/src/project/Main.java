package project;

public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        Teacher teacher1 = new Teacher("Иван Иванов", "Математика");
        Teacher teacher2 = new Teacher("Петя Петрова", "Информатика");

        gradeBook.addTeacher(teacher1);
        gradeBook.addTeacher(teacher2);

        Student student1 = new Student("Валентин", "Василев");
        Student student2 = new Student("Иван", "Иванов");

        gradeBook.addStudent(student1);
        gradeBook.addStudent(student2);

        gradeBook.addGradeToStudent(student1, new Grade(6, teacher1));
        gradeBook.addGradeToStudent(student1, new Grade(5, teacher2));
        gradeBook.addGradeToStudent(student2, new Grade(4, teacher1));

        gradeBook.showStudents();
        gradeBook.showGradesForStudent(student1);
        gradeBook.showGradesForStudent(student2);
    }
}

