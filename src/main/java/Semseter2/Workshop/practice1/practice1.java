package Semseter2.Workshop.practice1;

import javax.swing.*;

public class practice1 {
    public static final  int WINDOW_WIDTH=500;
    public static final int WINDOW_HEIGHT=500;
    public static void main(String[] args) {
        JFrame halon = new JFrame();
        halon.setVisible(true);//פקודת ראיה של החלון
        halon.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);// גודל
        halon.setLocationRelativeTo(null);// מגדיר את החלון במרכז
        halon.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// פקודה לx
        halon.setLayout(null);// מאפשר את השליטה ברמת הפיקסל
        halon.setResizable(false);// מבטל את השליטה בגודל הפיקסל


    }
}
