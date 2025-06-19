package Semseter2.Workshop.practice1;
import java.awt.*;
 // ייבוא מחלקות ממשק משתמש גרפי (GUI) של Java
    public class Obstacle { // הכרזה על מחלקה ציבורית בשם Obstacle (מכשול)
     public static final int STARTING_SIZE = 100; // הכרזה על קבוע ציבורי סטטי סופי (לא ניתן לשינוי) בשם STARTING_SIZE עם ערך 100
     public static final int RIGHT = 1; // הכרזה על קבוע ציבורי סטטי סופי בשם RIGHT עם ערך 1 (עשוי לייצג כיוון)
     public static final int LEFT = 2; // הכרזה על קבוע ציבורי סטטי סופי בשם LEFT עם ערך 2 (עשוי לייצג כיוון)
     private int x; // משתנה פרטי מסוג int לייצוג קואורדינטת X של המכשול
     private int y; // משתנה פרטי מסוג int לייצוג קואורדינטת Y של המכשול
     private int width; // משתנה פרטי מסוג int לייצוג רוחב המכשול
     private int height; // משתנה פרטי מסוג int לייצוג גובה המכשול
     private int direction; // משתנה פרטי מסוג int לייצוג כיוון התנועה של המכשול

     // בנאי (Constructor) של המחלקה Obstacle
     // מופעל כאשר יוצרים אובייקט חדש מסוג Obstacle
     public Obstacle(int x, int y) {
         this.x = x; // אתחול קואורדינטת X של האובייקט בערך שהתקבל כארגומנט
         this.y = y; // אתחול קואורדינטת Y של האובייקט בערך שהתקבל כארגומנט
         this.width = STARTING_SIZE; // אתחול רוחב המכשול בגודל ההתחלתי שהוגדר כקבוע
         this.height = STARTING_SIZE; // אתחול גובה המכשול בגודל ההתחלתי שהוגדר כקבוע
         this.direction = RIGHT; // אתחול כיוון התנועה של המכשול לימין (בהתאם לקבוע שהוגדר)
     }

     // מתודה ציבורית ללא החזרה (void) בשם move
     // מתודה זו ככל הנראה תכיל את הלוגיקה של תנועת המכשול
    

     public void flip() { // מתודה ציבורית ללא החזרה (void) בשם flip (הפוך)
         if (this.direction == LEFT) { // בדיקה האם כיוון המכשול הוא שמאלה
             this.direction = RIGHT; // אם כן, שינוי כיוון המכשול לימין
         } else { // אם כיוון המכשול אינו שמאלה (כלומר ימינה או ערך אחר)
             this.direction = LEFT; // שינוי כיוון המכשול לשמאלה
         }
     }

     public void move() { // מתודה ציבורית ללא החזרה (void) בשם move (זוהי המשך המתודה שהתחילה בתמונה הקודמת)
         if (this.direction == LEFT) { // בדיקה האם כיוון המכשול הוא שמאלה
             this.moveLeft(); // אם כן, קריאה למתודה moveLeft (שכנראה מטפלת בתנועה שמאלה)
         } else { // אם כיוון המכשול אינו שמאלה (כלומר ימינה או ערך אחר)
             this.moveRight(); // קריאה למתודה moveRight (שכנראה מטפלת בתנועה ימינה)
         }
     }

     private void moveLeft() {
         this.x--;
     }

     public int getX() { // מתודה ציבורית המחזירה ערך מסוג int בשם getX
         return this.x; // החזרת הערך של משתנה ה-x של האובייקט
     }

     public void moveRight() { // מתודה ציבורית ללא החזרה (void) בשם moveRight
this.x++;
     }
     public void shrink() {
         this.width--;
         this.height--;
     }
     public void paint(Graphics graphics){
         graphics.setColor(Color.BLUE);
         graphics.fillRect(this.x,this.y,this.width,this.height);
     }
     public int getWidth(){
         return width;
     }
     public int getY(){
         return y;
     }
     public int getHeight(){
         return height;
     }
 }
