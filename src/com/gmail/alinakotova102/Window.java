package com.gmail.alinakotova102;

import javax.swing.*;

public class Window extends JFrame {

    public Window() {
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 645);
        setLocation(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        Window window = new Window();
    }
}