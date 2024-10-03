package project;

public class Grade {
    private final double value;
    private final Teacher teacher;

    public Grade(double value, Teacher teacher) {
        this.value = value;
        this.teacher = teacher;
    }

    public double getValue() {
        return value;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return String.format("Оценка: %.2f, Преподавател: %s", value, teacher.getName());
    }
}
