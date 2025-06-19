package Semseter2.Workshop.Practice.CircleXGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class Main {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame window = new JFrame("איקס עיגול");
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        window.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 3));
        JButton[] buttons = new JButton[9];
        boolean[] x = {true};
        ImageIcon xIcon = loadIcon("src/main/resources/x.png",150,150);
        ImageIcon oIcon = loadIcon("src/main/resources/o.jpeg",150,150);
        System.out.println("xIcon loaded? " + (xIcon.getIconHeight()));
        System.out.println("oIcon loaded? " + (oIcon != null));


        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            panel.add(buttons[i]);
            int index = i;
            buttons[i].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (buttons[index].getIcon() != null) {
                        return;
                    }
                    if (x[0]) {
                        buttons[index].setIcon(xIcon);
//                        buttons[index].setText("x");
//                        buttons[index].setForeground(Color.BLUE);
                    } else {
                        buttons[index].setIcon(oIcon);
//                        buttons[index].setText("O"); // שים טקסט O על הכפתור
//                        buttons[index].setForeground(Color.RED);
                    }
                    x[0] = !x[0];
                    if(buttons[0].getIcon()!=null&& buttons[0].getIcon()==buttons[1].getIcon()&&buttons[1].getIcon()==buttons[2].getIcon()){
                        JOptionPane.showMessageDialog(null, "ניצחון! כל הכבוד 🏆");
                        return;
                    }if(buttons[3].getIcon()!=null&& buttons[3].getIcon()==buttons[4].getIcon()&&buttons[4].getIcon()==buttons[5].getIcon()){
                        JOptionPane.showMessageDialog(null, "ניצחון! כל הכבוד 🏆");
                        return;
                    }if(buttons[6].getIcon()!=null&& buttons[6].getIcon()==buttons[7].getIcon()&&buttons[7].getIcon()==buttons[8].getIcon()){
                        JOptionPane.showMessageDialog(null, "ניצחון! כל הכבוד 🏆");
                        return;
                    }if(buttons[0].getIcon() != null && buttons[0].getIcon().equals(buttons[3].getIcon()) && buttons[3].getIcon().equals(buttons[6].getIcon())){
                        JOptionPane.showMessageDialog(null, "ניצחון! כל הכבוד 🏆");
                        return;
                    }if(buttons[1].getIcon() != null && buttons[1].getIcon().equals(buttons[4].getIcon()) && buttons[4].getIcon().equals(buttons[7].getIcon())){
                        JOptionPane.showMessageDialog(null, "ניצחון! כל הכבוד 🏆");
                        return;
                    }if(buttons[2].getIcon() != null && buttons[2].getIcon().equals(buttons[5].getIcon()) && buttons[5].getIcon().equals(buttons[8].getIcon())) {
                        JOptionPane.showMessageDialog(null, "ניצחון! כל הכבוד 🏆");
                        return;
                    }    if (buttons[0].getIcon() != null && buttons[0].getIcon().equals(buttons[4].getIcon()) && buttons[4].getIcon().equals(buttons[8].getIcon())) {
                        JOptionPane.showMessageDialog(null, "ניצחון!");
                        return;
                    }  if (buttons[2].getIcon() != null && buttons[2].getIcon().equals(buttons[4].getIcon()) && buttons[4].getIcon().equals(buttons[6].getIcon())) {
                        JOptionPane.showMessageDialog(null, "ניצחון!");
                        return;
                    }

                    // בדיקת תיקו: אם אין אף כפתור ריק
                    boolean tie = true;
                    for (int i = 0; i < buttons.length; i++) {
                        if (buttons[i].getIcon() == null) {
                            tie = false;
                            break;
                        }
                    }
                    if (tie) {
                        showEndDialog(buttons, "תיקו!");
                    }
                }
            });
        }JButton restartButton = new JButton("התחל משחק חדש");
        window.add(restartButton, BorderLayout.SOUTH);

        restartButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetBoard(buttons);
            }
        });

        window.setVisible(true);
        window.repaint();
        window.revalidate();
    }



    public static ImageIcon loadIcon(String path, int width, int height) {
        ImageIcon icon = null;
        try {
            icon = new ImageIcon(path);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImg);
        } catch (Exception e) {
            System.out.println("שגיאה בטעינת תמונה: " + path);
        }
        return icon;
    }
    public static void showEndDialog(JButton[] buttons, String message) {
        int option = JOptionPane.showConfirmDialog(null, message + "\nהאם תרצה להתחיל משחק חדש?", "סיום משחק", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            resetBoard(buttons);
        } else {
            System.exit(0); // סוגר את המשחק
        }
    }
    public static void resetBoard(JButton[] buttons) {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setIcon(null); // מנקה את הכפתור
        }

    }
}
