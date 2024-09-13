//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Book book1 = new Book();

      book1.setTitle("Бесы");
        String title1 = book1.getTitle();
        System.out.println(title1);

      book1.setAuthor("Достоевский Ф.М.");
        String author1 = book1.getAuthor();
        System.out.println(author1);

      book1.setData(1871);
        int data1 = book1.getData();
        System.out.println(data1);
    }
}