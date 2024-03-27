package com.MuscleHome.entreno;

import com.MuscleHome.Principal;
import com.MuscleHome.assets.conexion;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Juan Pablo Aguirre Camilo Sandoval Harrisson Zapata
 */
public class Progreso extends javax.swing.JFrame {

    private final Panel panel;
    private static BufferedImage icono;
    private BufferedImage fondo;

    public Progreso() {
        panel = new Panel("src/com/MuscleHome/images/interfaz/progreso.png");
        initComponents();
        setUpRutina();
        setUp();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gd = (Graphics2D) g;
        gd.drawImage(fondo, 0, 0, this);

    }

    private void setUpRutina() {
        this.setResizable(false);
        this.setSize(960, 560);
        try {
            icono = ImageIO.read(new File("src/com/MuscleHome/images/interfaz/Logo.png"));
             

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setIconImage(icono);
        add(BorderLayout.CENTER, panel);
        panel.setSize(960, 590);
        panel.setToolTipText("Muscle Consulta");
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantorrilla = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        espalda = new javax.swing.JLabel();
        cintura = new javax.swing.JLabel();
        biceps = new javax.swing.JLabel();
        triceps = new javax.swing.JLabel();
        antebrazo = new javax.swing.JLabel();
        gluteo = new javax.swing.JLabel();
        muslo = new javax.swing.JLabel();
        pectoral = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(960, 550));

        pantorrilla.setText("jLabel1");

        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regresarMousePressed(evt);
            }
        });

        espalda.setText("jLabel1");

        cintura.setText("jLabel1");

        biceps.setText("jLabel1");

        triceps.setText("jLabel1");

        antebrazo.setText("jLabel1");

        gluteo.setText("jLabel1");

        muslo.setText("jLabel1");

        pectoral.setForeground(new java.awt.Color(255, 255, 255));
        pectoral.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(triceps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antebrazo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gluteo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muslo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espalda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cintura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biceps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pectoral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pantorrilla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pectoral, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(espalda, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cintura, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(biceps, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(triceps, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(antebrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gluteo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(muslo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pantorrilla, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)))
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_regresarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antebrazo;
    private javax.swing.JLabel biceps;
    private javax.swing.JLabel cintura;
    private javax.swing.JLabel espalda;
    private javax.swing.JLabel gluteo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel muslo;
    private javax.swing.JLabel pantorrilla;
    private javax.swing.JLabel pectoral;
    private javax.swing.JLabel regresar;
    private javax.swing.JLabel triceps;
    // End of variables declaration//GEN-END:variables

    private void setUp() {

        setResizable(false);
        this.jTextArea1.setText(conexion.obtenerHistorialMedidas(conexion.obtenerUsuario()));

        this.pectoral.setText(conexion.obtenerProgresoMusculo("pectoral", conexion.obtenerUsuario()));
        this.biceps.setText(conexion.obtenerProgresoMusculo("biceps", conexion.obtenerUsuario()));
        this.gluteo.setText(conexion.obtenerProgresoMusculo("gluteo", conexion.obtenerUsuario()));
        this.espalda.setText(conexion.obtenerProgresoMusculo("espalda", conexion.obtenerUsuario()));
        this.cintura.setText(conexion.obtenerProgresoMusculo("cintura", conexion.obtenerUsuario()));
        this.triceps.setText(conexion.obtenerProgresoMusculo("triceps", conexion.obtenerUsuario()));
        this.antebrazo.setText(conexion.obtenerProgresoMusculo("antebrazo", conexion.obtenerUsuario()));
        this.muslo.setText(conexion.obtenerProgresoMusculo("muslo", conexion.obtenerUsuario()));
        this.pantorrilla.setText(conexion.obtenerProgresoMusculo("pantorrila", conexion.obtenerUsuario()));

    }
}
