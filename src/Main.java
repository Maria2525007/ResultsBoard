public class Main {
    public static void main(String[] args) {
        ResultsBoard rb = new ResultsBoard();
        rb.addStudent("John", 85.5f);
        rb.addStudent("Alex", 90.0f);
        rb.addStudent("Sam", 87.5f);
        rb.addStudent("Tom", 92.0f);
        rb.addStudent("Jerry", 88.5f);
        System.out.println(rb.top3());
    }
}