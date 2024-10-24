package project;

public class Teacher {
    private final String name;
    private final String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return String.format("Преподавател: %s, Предмет: %s", name, subject);
    }
}
