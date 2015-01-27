/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.dougkelly88.FLIMPlateReaderGUI.GeneralGUIComponents;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Frederik
 */
public class ProgressBar extends javax.swing.JPanel {
    private HCAFLIMPluginFrame frameProBar;
    static Thread t;
    double i=0;
    double sassSize=1;

    /**
     * Creates new form ProgressBar
     */
    public ProgressBar() {
        initComponents();
        jProgressBar1.setValue(0);
        jProgressBar1.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("HCA sequence Progress...");
        jProgressBar1.setBorder(border);
        jProgressBar1.repaint();
        
    }
    
    
    public void stepIncrement(double ind, double sassSize) throws InterruptedException { 
        double prozentIncr= 1/sassSize*100;
        double prozentDouble= (ind+1)*prozentIncr;
        int prozentInt=(int) prozentDouble;
        jProgressBar1.setValue(prozentInt);
        jProgressBar1.repaint();

    }
    
    public void setTo(int to){
        jProgressBar1.setValue(to);
    }
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

}