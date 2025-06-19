package Semseter2.Workshop.Lesson6;

public class Utils {

    public static void sleep (long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

}
}
}
