package com.MuscleHome.entreno;

import com.MuscleHome.Principal;
import com.MuscleHome.assets.Colisiones;
import com.MuscleHome.assets.conexion;
import java.awt.BorderLayout;
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
import javax.swing.JOptionPane;

public class ConsultaModificacion extends javax.swing.JFrame implements MouseListener {

    private Panel panel;
    private BufferedImage icono;
    private String comando;

    public ConsultaModificacion() {
        initComponents();
        setUpConsulta();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        biceps = new java.awt.TextField();
        pectoral = new java.awt.TextField();
        gluteo = new java.awt.TextField();
        muslo = new java.awt.TextField();
        triceps = new java.awt.TextField();
        espalda = new java.awt.TextField();
        pantorrila = new java.awt.TextField();
        antebrazo = new java.awt.TextField();
        cintura = new java.awt.TextField();
        nombreUsuario = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        biceps.setText("textField1");

        pectoral.setText("textField1");

        gluteo.setText("textField1");

        muslo.setText("textField1");

        triceps.setText("textField1");

        espalda.setText("textField1");

        pantorrila.setText("textField1");

        antebrazo.setText("textField1");

        cintura.setText("textField1");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 730, Short.MAX_VALUE)
                .addComponent(fecha)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cintura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(espalda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pectoral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(biceps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(triceps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(antebrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gluteo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pantorrila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(muslo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pectoral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gluteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biceps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(espalda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muslo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(triceps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pantorrila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antebrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField antebrazo;
    private java.awt.TextField biceps;
    private java.awt.TextField cintura;
    private java.awt.TextField espalda;
    private javax.swing.JLabel fecha;
    private java.awt.TextField gluteo;
    private java.awt.TextField muslo;
    private javax.swing.JLabel nombreUsuario;
    private java.awt.TextField pantorrila;
    private java.awt.TextField pectoral;
    private java.awt.TextField triceps;
    // End of variables declaration//GEN-END:variables

    private void cambiarPantallaNivel() {

        if (conexion.consultarNivelExperienciaUsuario(conexion.obtenerUsuario()).equalsIgnoreCase("novato")) {
            panel = new Panel("src/com/MuscleHome/images/interfaz/Selec_N.jpg");
            add(BorderLayout.CENTER, panel);
            panel.setSize(this.getSize());
            panel.setToolTipText("Muscle Consulta");
            panel.addMouseListener(this);

        }

        if (conexion.consultarNivelExperienciaUsuario(conexion.obtenerUsuario()).equalsIgnoreCase("avanzado")) {
            panel = new Panel("src/com/MuscleHome/images/interfaz/Selec_A.jpg");
            add(BorderLayout.CENTER, panel);
            panel.setSize(this.getSize());
            panel.setToolTipText("Muscle Consulta");
            panel.addMouseListener(this);

        }

        if (conexion.consultarNivelExperienciaUsuario(conexion.obtenerUsuario()).equalsIgnoreCase("experimentado")) {
            panel = new Panel("src/com/MuscleHome/images/interfaz/Selec_E.jpg");
            add(BorderLayout.CENTER, panel);
            panel.setSize(this.getSize());
            panel.setToolTipText("Muscle Consulta");
            panel.addMouseListener(this);
        }

    }

    private void setUpConsulta() {

        nombreUsuario.setText(conexion.obtenerUsuario());
        fecha.setText(conexion.capturarFecha());
        try {
            icono = ImageIO.read(new File("src/com/MuscleHome/images/interfaz/Logo.png"));

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setIconImage(icono);

        setLocationRelativeTo(null);
        cambiarPantallaNivel();

        fecha.repaint();
        System.out.println("Usuario " + conexion.obtenerUsuario());
        vaciarTexto();
    }

    private void colisionesCM(MouseEvent me) {

        comando = "";

        if ((Colisiones.deteccionBotones(me.getPoint(), new Point(0, 57), 60, 123))) {
            comando = "HOME";
        }
        if (Colisiones.deteccionBotones(me.getPoint(), new Point(129, 57), 62, 390)) {
            comando = "verRutina";
        }
        if (Colisiones.deteccionBotones(me.getPoint(), new Point(56, 177), 21, 144)) {
            comando = "novato";
        }
        if (Colisiones.deteccionBotones(me.getPoint(), new Point(56, 199), 21, 144)) {
            comando = "avanzado";
        }
        if (Colisiones.deteccionBotones(me.getPoint(), new Point(56, 224), 21, 144)) {
            comando = "experimentado";
        }
        if (Colisiones.deteccionBotones(me.getPoint(), new Point(37, 420), 35, 190)) {
            comando = "verHistorial";
        }
        if (Colisiones.deteccionBotones(me.getPoint(), new Point(818, 517), 30, 105)) {
            if (!validarCamposMedidas()) {
                comando = "modificarMedidas";
            }
        }

        switch (comando) {

            case "HOME":

                this.setVisible(false);
                Home home = new Home();
                home.setVisible(true);
                break;

            case "verRutina":
                this.setVisible(false);
                System.out.println("ver Rutina" + "\n" + "----------");
                Rutina rutina = new Rutina();
                rutina.setVisible(true);
                break;

            case "novato":

                conexion.modificarNivelExperienciaUsuario("novato");
                setUpConsulta();
                JOptionPane.showMessageDialog(null, "Has cambiado tu nivel de experiencia por NOVATO", "Trinisoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/com/MuscleHome/images/interfaz/LogoSmall.png"));
                break;
            case "avanzado":

                conexion.modificarNivelExperienciaUsuario("avanzado");
                setUpConsulta();
                JOptionPane.showMessageDialog(null, "Has cambiado tu nivel de experiencia por AVANZADO", "Trinisoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/com/MuscleHome/images/interfaz/LogoSmall.png"));
                break;
            case "experimentado":

                conexion.modificarNivelExperienciaUsuario("experimentado");
                setUpConsulta();
                JOptionPane.showMessageDialog(null, "Has cambiado tu nivel de experiencia por EXPERIMENTADO", "Trinisoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/com/MuscleHome/images/interfaz/LogoSmall.png"));
                break;
            case "verHistorial":
                Progreso progreso = new Progreso();
                progreso.setVisible(true);
                progreso.addMouseListener(this);
                System.out.println("Historial de medidas");
                break;
            case "modificarMedidas":
                conexion.insertarMedida(Float.parseFloat(pectoral.getText()), "pectoral", conexion.obtenerUsuario());
                conexion.insertarMedida(Float.parseFloat(biceps.getText()), "biceps", conexion.obtenerUsuario());
                conexion.insertarMedida(Float.parseFloat(gluteo.getText()), "gluteo", conexion.obtenerUsuario());
                conexion.insertarMedida(Float.parseFloat(espalda.getText()), "espalda", conexion.obtenerUsuario());
                conexion.insertarMedida(Float.parseFloat(cintura.getText()), "cintura", conexion.obtenerUsuario());
                conexion.insertarMedida(Float.parseFloat(triceps.getText()), "triceps", conexion.obtenerUsuario());
                conexion.insertarMedida(Float.parseFloat(antebrazo.getText()), "antebrazo", conexion.obtenerUsuario());
                conexion.insertarMedida(Float.parseFloat(muslo.getText()), "muslo", conexion.obtenerUsuario());
                conexion.insertarMedida(Float.parseFloat(pantorrila.getText()), "pantorrila", conexion.obtenerUsuario());

                JOptionPane.showMessageDialog(null, "En hora buena!!  Has actualizado tus medidas", "Trinisoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/com/MuscleHome/images/interfaz/LogoSmall.png"));
                break;

        }

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        colisionesCM(me);
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

    private void vaciarTexto() {

        antebrazo.setText("");
        biceps.setText("");
        cintura.setText("");
        espalda.setText("");
        gluteo.setText("");
        muslo.setText("");
        pantorrila.setText("");
        triceps.setText("");
        pectoral.setText("");

    }

    private boolean validarCamposMedidas() {

        boolean validacion = false;
        if (pectoral.getText().equalsIgnoreCase("")
                || espalda.getText().equalsIgnoreCase("")
                || espalda.getText().equalsIgnoreCase("")
                || cintura.getText().equalsIgnoreCase("")
                || biceps.getText().equalsIgnoreCase("")
                || triceps.getText().equalsIgnoreCase("")
                || antebrazo.getText().equalsIgnoreCase("")
                || gluteo.getText().equalsIgnoreCase("")
                || muslo.getText().equalsIgnoreCase("")
                || pantorrila.getText().equalsIgnoreCase("")) {
            validacion = true;
            JOptionPane.showMessageDialog(null, "Para modificar las medidas, debes completar todos los campos", "Trinisoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/com/MuscleHome/images/interfaz/LogoSmall.png"));
        }
        return validacion;
    }

}
