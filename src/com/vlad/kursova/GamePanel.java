package com.vlad.kursova;

import java.awt.event.*;
/**
 *
 * @author Vlad Martyniuk
 */
interface GamePanel extends ActionListener{
    final static int PLAY = 1;
    final static int STOP = 2;
    final static int PAUSE =3;
    public void startNewGame();
    public void pauseGame();
    public void resumeGame();
    public void stopGame();
    public int getScore();
    public int getState();
    public void figureMoveRight();
    public void figureMoveLeft();
    public void figureMoveDown();
    public void figureRotate();
    public void gamePauseResume();

}

