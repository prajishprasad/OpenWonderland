/**
 * Open Wonderland
 *
 * Copyright (c) 2011, Open Wonderland Foundation, All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * The Open Wonderland Foundation designates this particular file as
 * subject to the "Classpath" exception as provided by the Open Wonderland
 * Foundation in the License file that accompanied this code.
 */

/*
 * ModelTestFrame.java
 *
 * Created on Oct 25, 2011, 1:16:40 PM
 */
package org.jdesktop.wonderland.modules.clienttest.test.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author jkaplan
 */
public class AudioTestFrame extends javax.swing.JFrame {
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(
            "org/jdesktop/wonderland/modules/clienttest/test/ui/resources/Bundle");
    
    private boolean answered = false;
    private boolean reverseAnswers = false;
    private TestResult answer;
    
    private float volume = 1.0f;
    
    
    /** Creates new form ModelTestFrame */
    public AudioTestFrame() {
        initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setAnswer(TestResult.NOT_RUN);
            }
        });
    }
    
    public synchronized void setVolume(float volume) {
        this.volume = volume;
        vuPanel.repaint();
    }
    
    public synchronized float getVolume() {
        return volume;
    }
    
    public void setHeadline(String headline) {
        headlineLabel.setText(headline);
    }
    
    public void setInstructions(String instructions) {
        instructionsLabel.setText(instructions);
    }
    
    public void setText(String text) {
        textLabel.setText(text);
    }
    
    public void setQuestion(String question) {
        questionLabel.setText(question);
    }
    
    public JButton getStartButton() {
        return startButton;
    }
    
    public void setAnswersEnabled(boolean enabled) {
        yesButton.setEnabled(enabled);
        noButton.setEnabled(enabled);
    }
    
    public void setAnswersReversed(boolean reversed) {
        this.reverseAnswers = reversed;
    }
    
    public TestResult waitForAnswer() throws InterruptedException {
        synchronized (this) {
            while (!isAnswered()) {
                wait();
            }
            
            return getAnswer();
        }
    }
    
    public synchronized void reset() {
        answered = false;
        answer = TestResult.NOT_RUN;
        reverseAnswers = false;
        
        volume = 0f;
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                setAnswersEnabled(true);
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionLabel = new javax.swing.JLabel();
        noButton = new javax.swing.JButton();
        yesButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        testHolder = new javax.swing.JPanel();
        headlineLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        instructionsLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        vuPanel = new VUMeterPanel();
        cancelButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        questionLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/jdesktop/wonderland/modules/clienttest/test/ui/resources/Bundle"); // NOI18N
        questionLabel.setText(bundle.getString("AudioTestFrame.questionLabel.text")); // NOI18N

        noButton.setText(bundle.getString("AudioTestFrame.noButton.text")); // NOI18N
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        yesButton.setText(bundle.getString("AudioTestFrame.yesButton.text")); // NOI18N
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        mainPanel.setLayout(new java.awt.GridLayout(1, 0));

        headlineLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        headlineLabel.setText(bundle.getString("AudioTestFrame.headlineLabel.text")); // NOI18N
        headlineLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        startButton.setText(bundle.getString("AudioTestFrame.startButton.text")); // NOI18N
        jPanel1.add(startButton);

        instructionsLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        instructionsLabel.setText(bundle.getString("AudioTestFrame.instructionsLabel.text")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        textLabel.setText(bundle.getString("AudioTestFrame.textLabel.text")); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        vuPanel.setOpaque(false);

        javax.swing.GroupLayout vuPanelLayout = new javax.swing.GroupLayout(vuPanel);
        vuPanel.setLayout(vuPanelLayout);
        vuPanelLayout.setHorizontalGroup(
            vuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        vuPanelLayout.setVerticalGroup(
            vuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout testHolderLayout = new javax.swing.GroupLayout(testHolder);
        testHolder.setLayout(testHolderLayout);
        testHolderLayout.setHorizontalGroup(
            testHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(testHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instructionsLabel)
                    .addComponent(headlineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
                .addContainerGap())
        );
        testHolderLayout.setVerticalGroup(
            testHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headlineLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(instructionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(testHolder);

        cancelButton.setText(bundle.getString("AudioTestFrame.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addContainerGap())
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionLabel)
                    .addComponent(noButton)
                    .addComponent(yesButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        setAnswer(reverseAnswers?TestResult.PASS:TestResult.FAIL);
    }//GEN-LAST:event_noButtonActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        setAnswer(reverseAnswers?TestResult.FAIL:TestResult.PASS);
    }//GEN-LAST:event_yesButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setAnswer(TestResult.NOT_RUN);
    }//GEN-LAST:event_cancelButtonActionPerformed

    protected synchronized void setAnswer(TestResult answer) {
        if (this.answered) {
            return;
        }
        
        this.answer = answer;
        this.answered = true;
        notifyAll();
    }
    
    protected synchronized boolean isAnswered() {
        return answered;
    }
    
    protected synchronized TestResult getAnswer() {
        return answer;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AudioTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AudioTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AudioTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AudioTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AudioTestFrame atf = new AudioTestFrame();
                atf.pack();
                atf.setVisible(true);
            }
        });
    }
    
    class VUMeterPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            // number of boxes in the width, given each box (with spacing) is
            // 16 px wide
            int boxes = width / 16;
            boxes = (int) (boxes * getVolume());
            
            for (int i = 0; i < boxes; i++) {
                Shape boxShape = new Rectangle2D.Float((16 * i) + 2, 1, 
                                                        12, height - 2);
                
                g2.setColor(Color.RED);
                g2.fill(boxShape);
                
                g2.setStroke(new BasicStroke(2f));
                g2.setColor(Color.BLACK);
                g2.draw(boxShape);
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel headlineLabel;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton noButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel testHolder;
    private javax.swing.JLabel textLabel;
    private javax.swing.JPanel vuPanel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
