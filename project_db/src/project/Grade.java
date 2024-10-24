package project;

public class Grade {
    private final double value;
    private final Teacher teacher;

    public Grade(double value, Teacher teacher) {
        this.value = value;
        this.teacher = teacher;
        this.subject = subject;
    }

    public double getValue() {
        return value;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return String.format("Оценка: %.2f, Преподавател: %s", value, teacher.getName());
    }
}
