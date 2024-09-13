package Clock;

public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;

    // Сеттеры
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        }
    }


    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }


    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
    }

    // Геттеры
    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    // Метод для увеличения времени на одну секунду
    public void tick() {
        this.seconds++;
        if (this.seconds == 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;
                if (this.hours == 24) {
                    this.hours = 0;
                }
            }
        }
    }

    // Реализация метода интерфейса Readable для вывода времени
    @Override
    public void readTime() {
        System.out.printf("Текущее время: %02d:%02d:%02d%n", this.hours, this.minutes, this.seconds);
    }
}
