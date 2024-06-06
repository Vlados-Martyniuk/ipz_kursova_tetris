package com.vlad.kursova;

/**
 *
 * @author Vlad Martyniuk
 */
public class Tetris {
    public static void main(String[] args) throws InterruptedException {
        TetrisFrame.setDefaultLookAndFeelDecorated(true);
        TetrisFrame frame = new TetrisFrame();
        frame.setVisible(true);
    }
}
