package Semseter2.OOP.Lesson3.Lights;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<=3; i++){
            Car cars =new Car(true,i);
            Thread t= new Thread(String.valueOf(cars));
            t.start();
            cars.drive();
            cars.passTrafficLights();
        }


       TrafficLight trafficLight1=new TrafficLight(2,0);
        TrafficLight trafficLight2=new TrafficLight(2,2000);
        TrafficLight trafficLight3=new TrafficLight(2,4000);
        TrafficLight trafficLight4=new TrafficLight(2,6000);

        new Thread(()->{ trafficLight1.run();}).start();
        new Thread(()->{  trafficLight2.run();}).start();
        new Thread(()->{    trafficLight3.run();}).start();
        new Thread(()->{   trafficLight4.run();}).start();


        while (true){
            try {
                Thread.sleep(1000);
                System.out.println("----------");
                System.out.println("1:"+trafficLight1);
                System.out.println("2:"+trafficLight2);
                System.out.println("3:"+trafficLight3);
                System.out.println("4:"+trafficLight4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


    }

