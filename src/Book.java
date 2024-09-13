

public class Book implements Displyable {
  String title;
  String author;
  int data;
// шаблон для создания объекта

// сеттеры

  public void setTitle(String title){
      this.title = title;

  }

  public void setAuthor(String author){
      this.author = author;
  }

  public void setData(int data){
      this.data = data;
  }
// геттеры

   public String getTitle(){
      return this.title;
   }

   public String getAuthor(){
      return this.author;
   }

   public int getData(){
      return this.data;
   }

    @Override
    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Data: " + this.data);
    }


}


