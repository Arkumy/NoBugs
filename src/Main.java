import Book.Book;
import Student.Student;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      {
        Book book1 = new Book();

      book1.setTitle("Бесы");
        String title1 = book1.getTitle();


      book1.setAuthor("Достоевский Ф.М.");
        String author1 = book1.getAuthor();

      book1.setData(1871);
        int data1 = book1.getData();

      book1.display();}

      {
        Student student1 = new Student();
        student1.setName("Arina");
        String name1 = student1.getName();

        student1.setAverageScore(75);
        int score1 = student1.getAverageScore();

        student1.setRecordBook(123456);
        int record_book1 = student1.getRecordBook();


        student1.print();



      }



    }
}