package Semseter2.OOP.Lesson3.Lights;

public class Car {
    private int speed;
    private int totalTimeToFinish;
    private boolean traveling;

    public Car() {

    }


    public String toString() {
        String car;
        car = "speed: " + this.speed + "time for the end: " + this.totalTimeToFinish + "//" + this.traveling;
        return car;
    }

    public void drive() {
        try {
            speed++;
            totalTimeToFinish++;
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
}
