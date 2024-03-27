package com.MuscleHome.entreno;

import com.MuscleHome.Principal;
import com.MuscleHome.assets.Colisiones;
import com.MuscleHome.assets.conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author Juan Pablo Aguirre
 *          Camilo Sandoval 
 *          Harrisson Zapata
 */
public class Home extends javax.swing.JFrame implements MouseListener {

    private static BufferedImage icono;
    private Panel panel;
    private String comando;
    String urlFb = "www.facebook.com/musclehome";
    String urlYoutube = "www.youtube.com/channel/UCrNw5jSIFjgZwLznX-GHVhg";
    Random rnd;

    public Home() {

        initComponents();
        setUpHome();

    }
    

    private void renovarFondo(String ruta) {

        panel = new Panel(ruta);
        add(BorderLayout.CENTER, panel);
        panel.setToolTipText("Muscle Home");
        panel.setSize(this.getSize());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tip = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tip.setText("tip");

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreUsuario.setText("nombreUsuario");
        nombreUsuario.setToolTipText("");

        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 715, Short.MAX_VALUE)
                .addComponent(fecha)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tip)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha))
                .addGap(163, 163, 163)
                .addComponent(tip)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JLabel tip;
    // End of variables declaration//GEN-END:variables

    private void setUpHome() {

        this.addMouseListener(this);

        try {
            icono = ImageIO.read(new File("src/com/MuscleHome/images/interfaz/Logo.png"));

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        rnd = new Random();
        this.setIconImage(icono);
        panel = new Panel("src/com/MuscleHome/images/interfaz/Home.jpg");
        add(BorderLayout.CENTER, panel);
        panel.setToolTipText("Muscle Home");
        panel.addMouseListener(this);
        setLocationRelativeTo(null);
        panel.setSize(this.getSize());
        this.setResizable(false);
        nombreUsuario.setText(conexion.obtenerUsuario());
        nombreUsuario.setBackground(new Color(0, 0, 0, 0));
        tip.setVisible(true);
        tip.setIcon(conexion.llamarTip((int) (rnd.nextDouble() * 3 + 1)));
        tip.setText("");
        fecha.setText(conexion.capturarFecha());

    }

    private void colisionesHome(MouseEvent me) {

        comando = "";

        if (Colisiones.deteccionBotones(me.getPoint(), new Point(129, 57), 62, 390)) {
            comando = "verRutina";
        }

        if (Colisiones.deteccionBotones(me.getPoint(), new Point(526, 57), 62, 432)) {
            comando = "consultaModificacion";
        }
        if (Colisiones.deteccionBotones(me.getPoint(), new Point(807, 323), 850, 362)) {
            comando = "enlaceFb";
        }
         if (Colisiones.deteccionBotones(me.getPoint(), new Point(807, 364), 850, 407)) {
            comando = "enlaceYoutube";
        }
         if (Colisiones.deteccionBotones(me.getPoint(), new Point(760, 517), 908, 533)){
             comando = "cerrarSesion";
         }

        switch (comando) {

            case "verRutina":
                System.out.println("ver Rutina" + "\n" + "----------");
                Rutina rutina = new Rutina();
                rutina.setVisible(true);
                this.setVisible(false);
                break;

            case "consultaModificacion":
                ConsultaModificacion cm = new ConsultaModificacion();
                cm.setVisible(true);
                this.setVisible(false);
                System.out.println("consulta y modificacion" + "\n" + "----------");
                break;

            case "enlaceFb":
        {
            try {
                try {
                    Desktop.getDesktop().browse(new URI(urlFb));
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
                
            case "enlaceYoutube":
        {
            try {
                try {
                    Desktop.getDesktop().browse(new URI(urlYoutube));
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
                
            case "cerrarSesion":
                cerrar();
                break;
               

        }

    }
    
    public void cerrar(){
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        colisionesHome(me);

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

}
