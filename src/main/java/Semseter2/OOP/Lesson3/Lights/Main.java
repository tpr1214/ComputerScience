package Semseter2.OOP.Lesson3.Lights;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight(2,4000);
        new Thread(() -> {
            trafficLight.time();
        } ).start();

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(trafficLight);
        }
    }


}
