package com.gmail.alinakotova102;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {

    private final int SIZE = 600;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private  boolean left;
    private  boolean right = true;
    private  boolean up;
    private  boolean down;
    private  boolean inGame = true;

    public GameField() {
        setBackground(Color.LIGHT_GRAY);
        loadImages();
    }

    public void loadImages() {
        ImageIcon appleIcon = new ImageIcon("apple.png");
        apple = appleIcon.getImage();

        ImageIcon dotIcon = new ImageIcon("dot.png");
        dot = dotIcon.getImage();
    }
}
