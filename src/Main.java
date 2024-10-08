import Book.Book;
import Car.Car;
import Clock.Clock;
import Student.Student;
import Point.Point;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            Book book1 = new Book();

            book1.setTitle("Бесы");
            book1.setAuthor("Достоевский Ф.М.");
            book1.setData(1871);
            book1.display();
        }

        {
            Student student1 = new Student();
            student1.setName("Arina");
            student1.setAverageScore(75);
            student1.setRecordBook(123456);
            student1.print();

        }

        {
            Point point1 = new Point();
            point1.setX(1);
            point1.setY(1);

            System.out.println("Начальные координаты: (" + point1.getX() + ", " + point1.getY() + ")");

            point1.moveUp();
            System.out.println("После moveUp: (" + point1.getX() + ", " + point1.getY() + ")");

            point1.moveRight();
            System.out.println("После moveRight: (" + point1.getX() + ", " + point1.getY() + ")");

            point1.moveDown();
            System.out.println("После moveDown: (" + point1.getX() + ", " + point1.getY() + ")");

            point1.moveLeft();
            System.out.println("После moveLeft: (" + point1.getX() + ", " + point1.getY() + ")");

            {
                Clock clock1 = new Clock();
                clock1.setHours(22);
                clock1.setMinutes(20);
                clock1.setSeconds(1);
                clock1.tick();
                clock1.readTime();
            }

            {
                Car car1 = new Car();
                car1.setMake("BMW");
                car1.setModel("M6");
                car1.setYear(2020);
                car1.start();
                car1.drive(10000);
                car1.stop();

            }
        }
    }
}