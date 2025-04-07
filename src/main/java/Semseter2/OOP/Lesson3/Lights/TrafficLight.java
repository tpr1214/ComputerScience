package Semseter2.OOP.Lesson3.Lights;

import java.util.Random;

public class TrafficLight {
    Random random = new Random();
    private int color;
    private int green;//1
    private int red;//2
    private int yellow;//3
    private int distanceFromStart;

    public TrafficLight(int color,int distanceFromStart) {
        Random random = new Random();
        this.color = color;
        this.green = random.nextInt(5000, 8000);
        this.red = random.nextInt(4000, 7000);
        this.yellow=1000;
        this.distanceFromStart=distanceFromStart;
    }


    public String toString() {
        String color = "";
        if (this.color == 1) {
            color = "green";
        }
        if (this.color == 2) {
            color = "red";
        }
        if (this.color == 3) {
            color = "yellow";
        }
        return color;
    }

    public void time() {
        while (true) {
            try {
            if (this.color == 1) {
                Thread.sleep(this.green);
                this.color=2;
            }
            if (this.color == 2) {
                Thread.sleep(this.red);
                this.color=3;
            }
            if (this.color == 3) {
                Thread.sleep(this.yellow);
                this.color=1;
            }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
