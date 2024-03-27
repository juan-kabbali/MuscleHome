/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MuscleHome.entreno;

import com.MuscleHome.Principal;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Juan Pablo Aguirre
 *          Camilo Sandoval 
 *          Harrisson Zapata
 */
public class Panel extends javax.swing.JPanel{
    
    private static BufferedImage fondo;
    

      public Panel(String imagen) {
        initComponents();
        cargarFondo(imagen);
      
        
        
        
    }
       
 
      
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g;

        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gd.drawImage(fondo, 0, 0, this);

    }
          
           private void cargarFondo(String imagen) {
       
        try {
           
           fondo = ImageIO.read(new File(imagen));

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
     
          public void recargarFondo(String ruta ){
          
              cargarFondo(ruta);
              repaint();
          
          
          }
           
           
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

   

}
