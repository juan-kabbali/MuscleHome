package com.MuscleHome.entreno;

import com.MuscleHome.Principal;
import com.MuscleHome.assets.Colisiones;
import com.MuscleHome.assets.conexion;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Rutina extends javax.swing.JFrame implements MouseListener {

    private PanelRutina panel;
    private BufferedImage icono;
    private String comando;
    private int dia = 1;
    private String experiencia;

    public Rutina() {

        panel = new PanelRutina();
        initComponents();
        setUpRutina();
        cambiarPantallaNivel(dia);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        r4 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        e1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        e1.setForeground(new java.awt.Color(255, 255, 255));
        e1.setText("Ejercicio1");
        e1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e1MousePressed(evt);
            }
        });

        e2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        e2.setForeground(new java.awt.Color(255, 255, 255));
        e2.setText("Ejercicio2");
        e2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e2MousePressed(evt);
            }
        });

        e4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        e4.setForeground(new java.awt.Color(255, 255, 255));
        e4.setText("Ejercicio4");
        e4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e4MousePressed(evt);
            }
        });

        e3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        e3.setForeground(new java.awt.Color(255, 255, 255));
        e3.setText("Ejercicio3");
        e3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e3MousePressed(evt);
            }
        });

        s2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("Ejercicio2");

        s1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("Ejercicio1");
        s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                s1MousePressed(evt);
            }
        });

        s4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setText("Ejercicio4");

        s3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setText("Ejercicio3");

        r4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        r4.setForeground(new java.awt.Color(255, 255, 255));
        r4.setText("Ejercicio4");

        r1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("Ejercicio1");
        r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                r1MousePressed(evt);
            }
        });

        r2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Ejercicio2");

        r3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setText("Ejercicio3");

        d3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        d3.setForeground(new java.awt.Color(255, 255, 255));
        d3.setText("Ejercicio3");

        d1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        d1.setForeground(new java.awt.Color(255, 255, 255));
        d1.setText("Ejercicio1");
        d1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d1MousePressed(evt);
            }
        });

        d2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        d2.setForeground(new java.awt.Color(255, 255, 255));
        d2.setText("Ejercicio2");

        d4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        d4.setForeground(new java.awt.Color(255, 255, 255));
        d4.setText("Ejercicio4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(e3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(e2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(e1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(e4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(s2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(r2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(r3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(d2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d2)
                        .addGap(6, 6, 6)
                        .addComponent(d3)
                        .addGap(6, 6, 6)
                        .addComponent(d4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2)
                        .addGap(6, 6, 6)
                        .addComponent(r3)
                        .addGap(6, 6, 6)
                        .addComponent(r4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(s2)
                            .addGap(6, 6, 6)
                            .addComponent(s3)
                            .addGap(6, 6, 6)
                            .addComponent(s4))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(e2)
                            .addGap(6, 6, 6)
                            .addComponent(e3)
                            .addGap(6, 6, 6)
                            .addComponent(e4))))
                .addGap(209, 209, 209))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void e1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MousePressed

        Ejercicio e = new Ejercicio();
        e.setFondo(this.llamarBufferedEjercicio(e1));
        e.setVisible(true);

    }//GEN-LAST:event_e1MousePressed

    private void s1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1MousePressed

    private void r1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1MousePressed

    private void d1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_d1MousePressed

    private void e1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MouseClicked


    }//GEN-LAST:event_e1MouseClicked

    private void e2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MousePressed

        Ejercicio e = new Ejercicio();
        e.setFondo(this.llamarBufferedEjercicio(e2));
        e.setVisible(true);
    }//GEN-LAST:event_e2MousePressed

    private void e3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e3MousePressed

        Ejercicio e = new Ejercicio();
        e.setFondo(this.llamarBufferedEjercicio(e3));
        e.setVisible(true);

    }//GEN-LAST:event_e3MousePressed

    private void e4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e4MousePressed

        Ejercicio e = new Ejercicio();
        e.setFondo(this.llamarBufferedEjercicio(e4));
        e.setVisible(true);
    }//GEN-LAST:event_e4MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel r3;
    private javax.swing.JLabel r4;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    // End of variables declaration//GEN-END:variables

    private void setUpRutina() {
        this.setResizable(false);
        this.setSize(960, 560);
        try {
            icono = ImageIO.read(new File("src/com/MuscleHome/images/interfaz/Logo.png"));

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setIconImage(icono);

        setLocationRelativeTo(null);

        if (conexion.consultarNivelExperienciaUsuario(conexion.obtenerUsuario()).equalsIgnoreCase("novato")) {
            panel.cargarFondo("src/com/MuscleHome/images/interfaz/RN.jpg");
            experiencia = "novato";
        }

        if (conexion.consultarNivelExperienciaUsuario(conexion.obtenerUsuario()).equalsIgnoreCase("avanzado")) {
            panel.cargarFondo("src/com/MuscleHome/images/interfaz/RA.jpg");
            experiencia = "avanzado";
        }

        if (conexion.consultarNivelExperienciaUsuario(conexion.obtenerUsuario()).equalsIgnoreCase("experimentado")) {
            panel.cargarFondo("src/com/MuscleHome/images/interfaz/RE.jpg");
            experiencia = "experimentado";
        }

        add(BorderLayout.CENTER, panel);
        panel.setSize(this.getSize());
        panel.setToolTipText("Rutina novata");
        panel.addMouseListener(this);
        panel.setToolTipText("Muscle Rutina");

    }

    private void cambiarPantallaNivel(int dia) {

        if (experiencia.equalsIgnoreCase("novato")) {
            e1.setText(conexion.consultarEjecuciones(1, dia)[0].toString());
            e1.setFocusable(true);
            s1.setText(conexion.consultarEjecuciones(1, dia)[1].toString());
            s1.setFocusable(true);
            r1.setText(conexion.consultarEjecuciones(1, dia)[2].toString());
            r1.setFocusable(true);
            d1.setText(conexion.consultarEjecuciones(1, dia)[3].toString());
            d1.setFocusable(true);
            e2.setText(conexion.consultarEjecuciones(1, dia)[4].toString());
            e2.setFocusable(true);
            s2.setText(conexion.consultarEjecuciones(1, dia)[5].toString());
            s2.setFocusable(true);
            r2.setText(conexion.consultarEjecuciones(1, dia)[6].toString());
            r2.setFocusable(true);
            d2.setText(conexion.consultarEjecuciones(1, dia)[7].toString());
            d2.setFocusable(true);

            e4.setText("");
            s3.setText("");
            r3.setText("");
            d3.setText("");
            e3.setText("");
            s4.setText("");
            r4.setText("");
            d4.setText("");

        }

        if (experiencia.equals("avanzado")) {
            e1.setText(conexion.consultarEjecuciones(2, dia)[0].toString());
            e1.setFocusable(true);
            s1.setText(conexion.consultarEjecuciones(2, dia)[1].toString());
            s1.setFocusable(true);
            r1.setText(conexion.consultarEjecuciones(2, dia)[2].toString());
            r1.setFocusable(true);
            d1.setText(conexion.consultarEjecuciones(2, dia)[3].toString());
            d1.setFocusable(true);
            e2.setText(conexion.consultarEjecuciones(2, dia)[4].toString());
            e2.setFocusable(true);
            s2.setText(conexion.consultarEjecuciones(2, dia)[5].toString());
            s2.setFocusable(true);
            r2.setText(conexion.consultarEjecuciones(2, dia)[6].toString());
            r2.setFocusable(true);
            d2.setText(conexion.consultarEjecuciones(2, dia)[7].toString());
            d2.setFocusable(true);
            e4.setText(conexion.consultarEjecuciones(2, dia)[8].toString());
            e4.setFocusable(true);
            s3.setText(conexion.consultarEjecuciones(2, dia)[9].toString());
            s3.setFocusable(true);
            r3.setText(conexion.consultarEjecuciones(2, dia)[10].toString());
            r3.setFocusable(true);
            d3.setText(conexion.consultarEjecuciones(2, dia)[11].toString());
            d3.setFocusable(true);

            e3.setText("");
            s4.setText("");
            r4.setText("");
            d4.setText("");

        }

        if (experiencia.equals("experimentado")) {

            e1.setText(conexion.consultarEjecuciones(3, dia)[0].toString());
            e1.setFocusable(true);
            s1.setText(conexion.consultarEjecuciones(3, dia)[1].toString());
            s1.setFocusable(true);
            r1.setText(conexion.consultarEjecuciones(3, dia)[2].toString());
            r1.setFocusable(true);
            d1.setText(conexion.consultarEjecuciones(3, dia)[3].toString());
            d1.setFocusable(true);
            e2.setText(conexion.consultarEjecuciones(3, dia)[4].toString());
            e2.setFocusable(true);
            s2.setText(conexion.consultarEjecuciones(3, dia)[5].toString());
            s2.setFocusable(true);
            r2.setText(conexion.consultarEjecuciones(3, dia)[6].toString());
            r2.setFocusable(true);
            d2.setText(conexion.consultarEjecuciones(3, dia)[7].toString());
            d2.setFocusable(true);
            e4.setText(conexion.consultarEjecuciones(3, dia)[8].toString());
            e4.setFocusable(true);
            s3.setText(conexion.consultarEjecuciones(3, dia)[9].toString());
            s3.setFocusable(true);
            r3.setText(conexion.consultarEjecuciones(3, dia)[10].toString());
            r3.setFocusable(true);
            d3.setText(conexion.consultarEjecuciones(3, dia)[11].toString());
            d3.setFocusable(true);
            e3.setText(conexion.consultarEjecuciones(3, dia)[12].toString());
            e3.setFocusable(true);
            s4.setText(conexion.consultarEjecuciones(3, dia)[13].toString());
            s4.setFocusable(true);
            r4.setText(conexion.consultarEjecuciones(3, dia)[14].toString());
            r4.setFocusable(true);
            d4.setText(conexion.consultarEjecuciones(3, dia)[15].toString());
            d4.setFocusable(true);

        }
    }

    private void colisionesRutina(MouseEvent me) {

        comando = "";

        if (Colisiones.deteccionBotones(me.getPoint(), new Point(526, 57), 62, 432)) {
            comando = "consultaModificacion";
        }
        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(0, 57), 60, 123))) {
            comando = "HOME";
        }
        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(26, 185), 54, 55))) {
            comando = "Dia1Semana1";
        }

        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(83, 185), 55, 52))) {
            comando = "Dia2Semana1";
        }

        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(139, 185), 58, 52))) {
            comando = "Dia3Semana1";
        }

        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(199, 185), 55, 52))) {
            comando = "Dia4Semana1";
        }
        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(30, 379), 53, 51))) {
            comando = "Dia1Semana2";
        }
        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(84, 379), 52, 53))) {
            comando = "Dia2Semana2";
        }
        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(142, 379), 52, 54))) {
            comando = "Dia3Semana2";
        }
        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(200, 379), 52, 54))) {
            comando = "Dia4Semana2";
        }

        switch (comando) {

            case "HOME":

                this.setVisible(false);
                Home home = new Home();
                home.setVisible(true);
                break;

            case "consultaModificacion":

                this.setVisible(false);
                ConsultaModificacion cm = new ConsultaModificacion();
                cm.setVisible(true);
                System.out.println("consulta y modificacion" + "\n" + "----------");
                break;

            case "Dia1Semana1":
                System.out.println("Dia 1 semana 1");
                if (dia == 1) {
                } else {
                    dia = 1;
                    cambiarPantallaNivel(dia);
                }

                break;

            case "Dia2Semana1":
                System.out.println("Dia 2 semana 1");
                if (dia == 2) {
                } else {
                    dia = 2;
                    cambiarPantallaNivel(dia);
                }

                break;

            case "Dia3Semana1":
                System.out.println("Dia 3 semana 1");
                dia = 3;
                cambiarPantallaNivel(dia);
                ;
                break;

            case "Dia4Semana1":
                System.out.println("Dia 4 semana 1");
                dia = 4;
                cambiarPantallaNivel(dia);
                ;
                break;

            case "Dia1Semana2":
                System.out.println("Dia 1 semana 2");
                dia = 1;
                cambiarPantallaNivel(dia);
                break;

            case "Dia2Semana2":
                System.out.println("Dia 2 semana 2");
                dia = 2;
                cambiarPantallaNivel(dia);
                break;

            case "Dia3Semana2":
                System.out.println("Dia 3 semana 2");
                dia = 3;
                cambiarPantallaNivel(dia);
                break;

            case "Dia4Semana2":
                System.out.println("Dia 4 semana 2");
                dia = 4;
                cambiarPantallaNivel(dia);
                break;

        }

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        colisionesRutina(me);

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

    private BufferedImage llamarBufferedEjercicio(JLabel ejercicio) {

        ImageIcon icon = conexion.llamarContenidoMM(ejercicio.getText());
        Image image = icon.getImage();
        BufferedImage buffered = (BufferedImage) image;
        System.out.println(ejercicio.getText());
        return buffered;

    }

}
