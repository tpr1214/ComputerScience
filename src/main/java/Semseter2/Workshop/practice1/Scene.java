package Semseter2.Workshop.practice1;

import javax.swing.*;
import java.awt.*;
public class Scene extends JPanel {
    private int width;
    private Player player;
    private Obstacle obstacle;

    public Scene(int x, int y,int i, int width){

    }


    public void mainGameLoop () {    // מתודה שמפעילה את הלולאת משחק הראשית
        new Thread(() -> {           // יצירת Thread חדש להרצת המשחק במקביל לממשק
            while (true) {           // לולאה אינסופית – מייצגת את הלולאת משחק
                this.obstacle.move();                 // מזיז את המכשול
                if (this.obstacle.getX() < 0) {       // אם המכשול יצא מגבול שמאל
                    this.obstacle.flip();            // שנה את כיוון התנועה
                } else if (this.obstacle.getX() > this.width - this.obstacle.getWidth()) {
                    // אם המכשול יצא מגבול ימין
                    this.obstacle.flip();            // שנה את כיוון התנועה
                }
                if (checkCollision()) {              // בדיקה אם יש התנגשות בין שחקן למכשול
                    this.obstacle.shrink();          // אם יש – הקטן את המכשול
                }
                try {
                    repaint();                       // מצייר מחדש את הפאנל
                    Thread.sleep(10);                // עיכוב קצר (10 מילישניות)
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);   // טיפול בשגיאת Thread
                }
            }
        }).start();                                   // מתחיל את הלולאה של המשחק
    }
        public boolean checkCollision () {                     // פונקציה שבודקת התנגשות בין שחקן למכשול
            Rectangle playerRect = new Rectangle(              // יוצרת מלבן עבור השחקן
                    this.player.getX(),                            // מיקום X של השחקן
                    this.player.getY(),                            // מיקום Y של השחקן
                    50, 50                                         // רוחב וגובה של המלבן (50x50)
            );
            Rectangle obstacleRect = new Rectangle(            // יוצרת מלבן עבור המכשול
                    this.obstacle.getX(),                          // מיקום X של המכשול
                    this.obstacle.getY(),                          // מיקום Y של המכשול
                    this.obstacle.getWidth(),                      // רוחב של המכשול
                    this.obstacle.getHeight()                      // גובה של המכשול
            );
            if (playerRect.intersects(obstacleRect)) {         // בודק אם יש חפיפה בין שני המלבנים
                return true;                                   // אם כן – יש התנגשות
            } else {
                return false;                                  // אם לא – אין התנגשות
            }
        }
    }



