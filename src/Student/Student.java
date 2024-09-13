package Student;
public class Student {
    String name;
    int recordBook;
    int averageScore;

    // сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public void setRecordBook(int recordBook) {
        this.recordBook = recordBook;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    // геттеры

    public String getName() {
        return this.name;
    }

    public int getRecordBook() {
        return this.recordBook;
    }

    public int getAverageScore() {
        return this.averageScore;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Record Book: " + this.recordBook);
        System.out.println("Average Score: " + this.averageScore);
    }
}
