import Semseter2.Workshop.Lesson6.Fork;
import Semseter2.Workshop.Lesson6.Philosopher;
import Semseter2.Workshop.Lesson6.Utils;

public static void main(String[] args) {
    Fork fork1 = new Fork(1);
    Fork fork2 = new Fork(2);
    Philosopher philosopher1 = new Philosopher("John Lock", fork1, fork2);
    Philosopher philosopher2 = new Philosopher("Plato", fork2, fork1);
    new Thread(() -> {
        while (true) {
            System.out.println(philosopher1);
            System.out.println(philosopher2);
            Utils.sleep(1000);
        }
    }).start();
}
