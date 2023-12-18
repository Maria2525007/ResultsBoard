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
        Iterator<Student> iterator = students.iterator();
        int count = 0;
        while (iterator.hasNext() && count < 3) {
            top3Students.add(iterator.next().name);
            count++;
        }
        return top3Students;
    }
}