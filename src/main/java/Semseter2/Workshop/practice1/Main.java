package Semseter2.Workshop.practice1;

import javax.swing.*;

public class Main {
    public static final  int WINDOW_WIDTH=500;
    public static final int WINDOW_HEIGHT=500;
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setVisible(true);//פקודת ראיה של החלון
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);// גודל
        window.setLocationRelativeTo(null);// מגדיר את החלון במרכז
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// פקודה לx
        window.setLayout(null);// מאפשר את השליטה ברמת הפיקסל
        window.setResizable(false);// מבטל את השליטה בגודל הפיקסל
        Menu menu = new Menu(0, 0, WINDOW_WIDTH / 5, WINDOW_HEIGHT); // יוצר תפריט וממקם אותו בצד שמאל של החלון (1/5 מהרוחב).
        window.add(menu); // מוסיף את התפריט לחלון.
        Scene scene = new Scene(WINDOW_WIDTH / 5, 0, WINDOW_WIDTH * 4 / 5, WINDOW_HEIGHT); // יוצר אזור משחק (Scene) שתופס את שארית החלון.
        window.add(scene); // מוסיף את אזור המשחק לחלון.
        window.setVisible(true); // מציג את החלון – רק לאחר שקרואים את השורה הזו רואים אותו בפועל.
    }
}

