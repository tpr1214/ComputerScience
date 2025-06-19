package Semseter2.Workshop.practice1;
    import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
    /**
     * מאזין לתנועת השחקן לפי לחיצות מקשים.
     */
    public class MovementListener implements KeyListener {
        private Scene scene;    // הפניה ללוח המשחק
        private Player player;  // הפניה לשחקן

        /**
         * בנאי - קושר את המאזין לסצנה ולשחקן
         */
        public MovementListener(Scene scene, Player player) {
            this.scene = scene;
            this.player = player;
        }

        /**
         * פעולה שמתבצעת כשמקש נלחץ
         */


        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                this.player.moveUp();
                this.player.moveUp();
                this.player.moveUp();
                this.scene.repaint();
            } else if (e.getKeyCode() == KeyEvent.VK_ALT) {
                this.player.moveDown();
            }
        }

        public void keyTyped(KeyEvent e) {
        }

        public void keyReleased(KeyEvent e) {
        }

        {
            {


            }
        }
    }
