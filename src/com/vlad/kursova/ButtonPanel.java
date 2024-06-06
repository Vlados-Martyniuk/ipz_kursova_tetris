package com.vlad.kursova;


/**
 *
 * @author Vlad Martyniuk
 */
public class ButtonPanel extends javax.swing.JPanel {
    private TetrisFrame frame;

    public ButtonPanel(TetrisFrame frame) {
        this.frame = frame;
        initComponents();
    }

    private void initComponents() {

        jButtonResume = new javax.swing.JButton();
        jButtonPause = new javax.swing.JButton();
        jButtonNewGame = new javax.swing.JButton();

        setFocusable(false);

        jButtonResume.setText("Продовжити");
        jButtonResume.setFocusable(false);
        jButtonResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResumeActionPerformed(evt);
            }
        });
        add(jButtonResume);

        jButtonPause.setText("Пауза");
        jButtonPause.setFocusable(false);
        jButtonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPauseActionPerformed(evt);
            }
        });
        add(jButtonPause);

        jButtonNewGame.setText("Нова гра");
        jButtonNewGame.setFocusable(false);
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });
        add(jButtonNewGame);
    }

    private void jButtonResumeActionPerformed(java.awt.event.ActionEvent evt) {
        frame.continueButtonPressed(evt);
    }

    private void jButtonPauseActionPerformed(java.awt.event.ActionEvent evt) {
        frame.pauseButtonPressed(evt);
    }

    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frame.newgameButtonPressed(evt);
    }


    private javax.swing.JButton jButtonResume;
    private javax.swing.JButton jButtonPause;

    private javax.swing.JButton jButtonNewGame;

}

