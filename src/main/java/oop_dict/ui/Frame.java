/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_dict.ui;

/**
 *
 * @author hungh
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;

public final class Frame extends javax.swing.JFrame {
    /**
     * Creates new form Frame
     */

    public Frame() {
        initComponents();
        this.initialize();
    }
    
    public void show() {
        super.show();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextArea1 = new javax.swing.JTextArea();
        startButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jTextArea1.setEditable(false);
        jTextArea1.setText("Các chức năng chính: \n"
                + "+ Tra cứu từ điển Anh - Việt \n"
                + "+ Dịch Anh - Việt \n\n\n\n\n\n\n\n\n\n"
                + "MADE BY AQUAHOLIC + HUNGHZ");
        
        jTextArea1.setSize(800, 450);
        jTextArea1.setLocation(200, 150);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        startButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        helpButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        helpButton.setText("About the Product");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        
        HomeButton = new JButton();
        HomeButton.setFont(new java.awt.Font("Segoe UI", 0, 18));
        HomeButton.setText("HOME");
        HomeButton.setPreferredSize(new java.awt.Dimension(100, 100));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        homeButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(479, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(182, 182, 182)
                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        HomeButton.show(false);
        startButton.show(true);
        helpButton.show(true);
        frame2.setVisible(false);
        this.setVisible(true);
    }  
    
    public void initialize() {
        frame2 = new NewJFrame();
        frame2.setSize(1200,1000);
        frame2.setLocation(100,10);
        HomeButton.setVisible(false);
        
        this.setSize(1200,1000);
        this.setLocation(100,10);
        homeButton.setVisible(false);
        jTextArea1.setVisible(false);
        this.add(startButton);
        this.add(helpButton);
        this.add(homeButton);
        this.add(jTextArea1);
        homeButton.setLocation(0,0);
        homeButton.setSize(100,100);
    }
    
    private void start_the_dic() {
        frame2.setVisible(true);
    }
    
    private void help_menu() {
        homeButton.setVisible(true);
        helpButton.setVisible(false);
        startButton.setVisible(false);
        jTextArea1.setVisible(true);
    }
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        start_the_dic();
    }                                           

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        startButton.show(false);
        helpButton.show(false);
        homeButton.show(true);
        help_menu();
    }                                          

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        homeButton.show(false);
        startButton.show(true);
        helpButton.show(true);
        jTextArea1.setVisible(false);
    }

    // Variables declaration - do not modify   
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton startButton;
    private javax.swing.JTextArea jTextArea1;
    private NewJFrame frame2;
    // End of variables declaration                   

}
