import java.util.*;

public class ResultsBoard {
    TreeSet<Student> students;

    public ResultsBoard() {
        students = new TreeSet<>((s1, s2) -> Float.compare(s1.score, s2.score));
    }

    public void addStudent(String name, Float score) {
        students.add(new Student(name, score));
    }

    public List<String> top3() {
        List<String> top3Students = new ArrayList<>();
        Iterator<Student> it = students.descendingIterator();
        for (int i = 0; i < 3; i++) {
            top3Students.add(it.next().name);
        }
        return top3Students;
    }
}