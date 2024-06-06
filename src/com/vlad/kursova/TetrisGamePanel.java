package com.vlad.kursova;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Vlad Martyniuk
 */
public class TetrisGamePanel extends javax.swing.JPanel implements GamePanel,ActionListener {
    private Glass stakan;
    private Figure fig = null;
    private int score = 0;
    private int gameState;
    private int[] DELAY = {500, 450, 400, 350, 300, 250, 200, 150, 100, 50};
    private int level = 1;
    Timer t = new javax.swing.Timer(DELAY[level], this);

    public TetrisGamePanel() {

        stakan = new Glass();
        startNewGame();
        t.start();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        stakan.draw(g);
        fig.draw(g);
        g.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        g.setColor(Color.BLACK);
        g.drawString("Рахунок: " + score, 350, 250);
        g.drawString("Рівень: " + level, 350, 300);
    }

    public int getScore() {
        return score;
    }

    public void startNewGame() {
        score = 0;
        level = 1;
        fig = new Figure();
        stakan = new Glass();
        gameState = PLAY;
    }

    public void pauseGame() {
        if (gameState == PLAY) {
            gameState = PAUSE;
        }
    }

    public void resumeGame() {
        if (gameState == PAUSE) {
            gameState = PLAY;
        }
    }

    public void stopGame() {
        gameState = STOP;
    }

    public int getState() {
        return gameState;
    }


    public void figureMoveRight(){
        if (fig.canRight(stakan)& gameState==PLAY)
            fig.moveRight();
    }

    public void figureMoveLeft(){
        if (fig.canLeft(stakan)& gameState==PLAY)
            fig.moveLeft();
    }

    public void figureMoveDown(){
        t.setDelay(DELAY[level]/20);
    }

    public void figureRotate(){
        if (fig.canRotate(stakan)& gameState==PLAY)
            fig.rotate();
    }

    public void gamePauseResume(){
        if (gameState==PLAY) {
            gameState = PAUSE;
        }
        else
        if (gameState==PAUSE) {
            gameState = PLAY;
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (gameState != PLAY) {
            return;
        }
        int bonus;
        if (fig.canDown(stakan)) {
            fig.moveDown();
        } else {
            if ((bonus = stakan.acceptFigure(fig)) < 0) {
                stopGame();
            }
            if (bonus > 0) {
                switch (bonus) {
                    case 4:
                        score += 20;
                    case 3:
                        score += 15;
                    case 2:
                        score += 10;
                    case 1:
                        score += 5;
                }

                int newLevel = score / 100 + 1;
                if (newLevel > level && level < 9) {
                    level++;
                }
            }

            if (gameState == PLAY) {
                fig = new Figure();
                t.setDelay(DELAY[level]);
            }
        }
        repaint();

    }

}

