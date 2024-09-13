package Car;

public class Car implements Drivable {
    String make;
    String model;
    int year;
    int distance;

    public void setMake(String make){
        this.make = make;
    }

    public String getMake(){
        return this.make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }
    public int getDistance(){
        return this.distance;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль "  + make + " " + model + " " + year + " года заведен.");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановлен.");

    }

    @Override
    public void drive(int distance) {
        this.distance = distance;
        System.out.println("Автомобиль проехал " + distance + " км.");

    }
}
