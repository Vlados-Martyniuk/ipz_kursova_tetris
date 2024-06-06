package com.vlad.kursova;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Vlad Martyniuk
 */

public class TetrisFrame extends javax.swing.JFrame {
    public TetrisFrame() {
        initComponents();
        tetrisGamePanel1.grabFocus();
    }

    private void initComponents() {

        buttonPanel1 = buttonPanel1 = new ButtonPanel(this);
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNewGame = new javax.swing.JMenuItem();
        menuPauseGame = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        menuFileExit = new javax.swing.JMenuItem();
        tetrisGamePanel1 = new com.vlad.kursova.TetrisGamePanel();
        menuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuNewGame1 = new javax.swing.JMenuItem();
        menuPauseGame1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        menuFileExit1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        jMenu1.setText("File");

        menuNewGame.setText("Item");
        jMenu1.add(menuNewGame);

        menuPauseGame.setText("Item");
        jMenu1.add(menuPauseGame);
        jMenu1.add(jSeparator1);

        menuFileExit.setText("Item");
        jMenu1.add(menuFileExit);

        menuBar.add(jMenu1);

        tetrisGamePanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tetrisGamePanel1KeyPressed(evt);
            }
        });

        menuBar1.setFocusable(false);

        jMenu2.setText("File");
        jMenu2.setFocusable(false);

        menuNewGame1.setText("Start New Game");
        menuNewGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewGame1ActionPerformed(evt);
            }
        });
        jMenu2.add(menuNewGame1);

        menuPauseGame1.setText("Stop Game");
        menuPauseGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPauseGame1ActionPerformed(evt);
            }
        });
        jMenu2.add(menuPauseGame1);
        jMenu2.add(jSeparator2);

        menuFileExit1.setText("Exit");
        menuFileExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileExit1ActionPerformed(evt);
            }
        });
        jMenu2.add(menuFileExit1);

        menuBar1.add(jMenu2);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(153, 153, 153)
                                                .addComponent(buttonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(tetrisGamePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tetrisGamePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void tetrisGamePanel1KeyPressed(java.awt.event.KeyEvent evt) {
        TetrisGamePanel p = (TetrisGamePanel)tetrisGamePanel1;
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                p.figureMoveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                p.figureMoveRight();
                break;
            case KeyEvent.VK_UP:
                p.figureRotate();
                break;
            case KeyEvent.VK_DOWN:
                p.figureMoveDown();
                break;
            case KeyEvent.VK_F2:
                p.startNewGame();
                break;
            case KeyEvent.VK_F3:
                p.gamePauseResume();
                break;
            default: return;
        }
        repaint();
    }

    private void menuNewGame1ActionPerformed(java.awt.event.ActionEvent evt) {
        TetrisGamePanel p = (TetrisGamePanel)tetrisGamePanel1;
        p.startNewGame();
    }

    private void menuPauseGame1ActionPerformed(java.awt.event.ActionEvent evt) {
        TetrisGamePanel p = (TetrisGamePanel)tetrisGamePanel1;
        p.stopGame();
    }

    private void menuFileExit1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }


    public void continueButtonPressed(ActionEvent evt) {
        TetrisGamePanel p = (TetrisGamePanel)tetrisGamePanel1;
        p.resumeGame();
    }

    public void pauseButtonPressed(ActionEvent evt) {
        TetrisGamePanel p = (TetrisGamePanel)tetrisGamePanel1;
        p.pauseGame();
    }

    public void newgameButtonPressed(ActionEvent evt) {
        TetrisGamePanel p = (TetrisGamePanel)tetrisGamePanel1;
        p.startNewGame();
    }


    private com.vlad.kursova.ButtonPanel buttonPanel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JMenuItem menuFileExit;
    private javax.swing.JMenuItem menuFileExit1;
    private javax.swing.JMenuItem menuNewGame;
    private javax.swing.JMenuItem menuNewGame1;
    private javax.swing.JMenuItem menuPauseGame;
    private javax.swing.JMenuItem menuPauseGame1;
    private com.vlad.kursova.TetrisGamePanel tetrisGamePanel1;
}
