
package com.MuscleHome.assets;

import com.MuscleHome.Principal;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class RecuperacionContraseña extends javax.swing.JFrame {

    
    private BufferedImage fondo;
    private static BufferedImage icono;
    
    public RecuperacionContraseña() {
        initComponents();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gd = (Graphics2D) g;
        gd.drawImage(fondo, 0, 0, this);

    }
 private void cargarFondo() {
        try {
            fondo = ImageIO.read(new File("src/com/MuscleHome/images/Inicio.png"));
            icono = ImageIO.read(new File("src/com/MuscleHome/images/Logo.png"));

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
