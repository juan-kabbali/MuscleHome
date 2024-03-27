package com.MuscleHome;

import com.MuscleHome.assets.Colisiones;
import com.MuscleHome.assets.conexion;
import com.MuscleHome.entreno.Home;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan Pablo Aguirre
 *          Camilo Sandoval 
 *          Harrisson Zapata
 */
public class Principal extends javax.swing.JFrame implements MouseListener {

    private static BufferedImage icono;
    private BufferedImage fondo;
    private String comando;

    public Principal() {
        super("Principal");
        initComponents();
        cargarFondo();
        setUpPrincipal();

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gd = (Graphics2D) g;
        gd.drawImage(fondo, 0, 0, this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        usuario = new java.awt.TextField();
        jPanel3 = new javax.swing.JPanel();
        contraseña = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuario.setText("textField1");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        contraseña.setEchoChar(('*'));
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

    }//GEN-LAST:event_usuarioActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        contraseña.setEchoChar('*');
    }//GEN-LAST:event_contraseñaActionPerformed

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            AccesoTeclaEnter();
        }// TODO add your handling code here:
    }//GEN-LAST:event_contraseñaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField contraseña;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.TextField usuario;
    // End of variables declaration//GEN-END:variables

    private void cargarFondo() {
        try {
            fondo = ImageIO.read(new File("src/com/MuscleHome/images/interfaz/Inicio.png"));
            icono = ImageIO.read(new File("src/com/MuscleHome/images/interfaz/Logo.png"));
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setIconImage(icono);

    }

    private void colisionesPrincipal(MouseEvent me) {

        comando = "";

        if (Colisiones.deteccionBotones(me.getPoint(), new Point(320, 505), 25, 310)) {
            comando = "registro";
        }

        if (Colisiones.deteccionBotones(me.getPoint(), new Point(374, 465), 31, 198)) {
            comando = "ingresar";
        }

        switch (comando) {

            case "registro":
                System.out.println("Registrar usuario");
                Registro registro = new Registro();
                registro.setVisible(true);
                this.setVisible(false);
                break;

            case "ingresar":

                if (this.usuario.equals("") || this.contraseña.equals("")) {
                }
                if (conexion.login(this.usuario.getText(), this.contraseña.getText())) {

                    Home home = new Home();
                    home.setVisible(true);

                    System.out.println("Inicio MuscleHome" + "\n" + usuario.getText());
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas", "Trinisoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/com/MuscleHome/images/interfaz/LogoSmall.png"));
                }

                break;

        }

    }

    @Override
    public void mousePressed(MouseEvent me) {
        colisionesPrincipal(me);
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    private void setUpPrincipal() {
        usuario.setText("");
        this.setSize(960, 560);
        setResizable(false);
        this.addMouseListener(this);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void AccesoTeclaEnter() {
        if (this.usuario.equals("") || this.contraseña.equals("")) {
        }
        if (conexion.login(this.usuario.getText(), this.contraseña.getText())) {

            Home home = new Home();
            home.setVisible(true);

            System.out.println("Inicio MuscleHome" + "\n" + usuario.getText());
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas", "Trinisoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/com/MuscleHome/images/interfaz/LogoSmall.png"));
        }
    }

}
