package Semseter2.OOP.Lesson3.Lights;

import java.util.Random;

public class Car {
    private int speed;
    private int totalTimeToFinish;
    private boolean traveling;
    private int location;
    private int id;


    public Car(boolean traveling,int id) {
        Random random = new Random();
        this.speed = random.nextInt(50, 81);
        this.traveling = traveling;
        this.location = 0;
        this.id=id;


    }

    public boolean canDrive() {
        if (location <= 6200) {
            traveling = true;
            return traveling;
        } else {
            traveling = false;
            return traveling;
        }
    }


    public String toString() {
        String car;
        car = "the speed of the car:  " + this.speed + "  time for the end: " + this.totalTimeToFinish + "  Active?  " + canDrive() + "  " + location;
        return car;
    }

    public void drive() {
        while (canDrive()) {
            try {
                speed++;
                totalTimeToFinish++;
                location += (this.speed * 10);
                System.out.println(toString());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void passTrafficLights() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Car " + this.id + " is crossing traffic light " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
