package com.MuscleHome;

import com.MuscleHome.assets.Colisiones;
import com.MuscleHome.assets.conexion;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Medidas extends javax.swing.JFrame implements MouseListener{

    
    private static BufferedImage icono;
    private BufferedImage fondo;
    private String comando;
    private Experiencia appRefExp;
     
    

    
    public Medidas(Experiencia appRefExp) {
        
         super("Medidas");
         
        this.appRefExp = appRefExp;
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUpMedidas();
        cargarFondo();
        
 }

     public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gd = (Graphics2D) g;
        gd.drawImage(fondo, 0, 0, this);

    }
     
      private void cargarFondo() {
        try {
            fondo = ImageIO.read(new File("src/com/MuscleHome/images/interfaz/Medidas.png"));
            icono = ImageIO.read(new File("src/com/MuscleHome/images/interfaz/Logo.png"));

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pectoral = new java.awt.TextField();
        espalda = new java.awt.TextField();
        cintura = new java.awt.TextField();
        biceps = new java.awt.TextField();
        triceps = new java.awt.TextField();
        antebrazo = new java.awt.TextField();
        gluteo = new java.awt.TextField();
        muslo = new java.awt.TextField();
        pantorrilla = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pectoral.setText("textField1");

        espalda.setText("textField1");

        cintura.setText("textField1");

        biceps.setText("textField1");

        triceps.setText("textField1");

        antebrazo.setText("textField1");

        gluteo.setText("textField1");

        muslo.setText("textField1");

        pantorrilla.setText("textField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cintura, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espalda, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pectoral, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(antebrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(triceps, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biceps, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pantorrilla, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muslo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gluteo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(biceps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(triceps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(antebrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pectoral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(espalda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(cintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gluteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(muslo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(pantorrilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField antebrazo;
    private java.awt.TextField biceps;
    private java.awt.TextField cintura;
    private java.awt.TextField espalda;
    private java.awt.TextField gluteo;
    private java.awt.TextField muslo;
    private java.awt.TextField pantorrilla;
    private java.awt.TextField pectoral;
    private java.awt.TextField triceps;
    // End of variables declaration//GEN-END:variables

      private void colisionesMedidas(MouseEvent me){    
            
        comando = "";

        if (Colisiones.deteccionBotones(me.getPoint(), new Point(28, 520), 25, 118)) {
            comando = "regresar";}

        if (Colisiones.deteccionBotones(me.getPoint(), new Point(810, 520), 25, 120)) {
                   
            if(!validarMedidas()){
                comando="IngresarMedidas";
            }
        }
         switch (comando) {

            case "regresar":
                System.out.println("Back to registro");
                Registro registro = new Registro();
                registro.setVisible(true);
                this.setVisible(false);
              

            case "IngresarMedidas":
                String usuario =  appRefExp.getAppRefReg().getUsuario();
                conexion.insertarMedida(Float.parseFloat(pectoral.getText()), "pectoral", usuario);
                conexion.insertarMedida(Float.parseFloat(espalda.getText()), "espalda", usuario);
                conexion.insertarMedida(Float.parseFloat(cintura.getText()), "cintura", usuario);
                conexion.insertarMedida(Float.parseFloat(biceps.getText()), "biceps", usuario);
                conexion.insertarMedida(Float.parseFloat(triceps.getText()), "triceps", usuario);
                conexion.insertarMedida(Float.parseFloat(antebrazo.getText()), "antebrazo", usuario);
                conexion.insertarMedida(Float.parseFloat(gluteo.getText()), "gluteo", usuario);
                conexion.insertarMedida(Float.parseFloat(muslo.getText()), "muslo", usuario);
                conexion.insertarMedida(Float.parseFloat(pantorrilla.getText()), "pantorrila", usuario);
                Principal principal = new Principal();
                principal.setVisible(true);
                
                this.setVisible(false);
              

           
    }}
    @Override
    public void mouseClicked(MouseEvent me) {
        
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        colisionesMedidas(me);
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

    private void setUpMedidas(){

        this.setIconImage(icono);
   
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(960, 560);
        setResizable(false);
        setLocationRelativeTo(null);
        this.addMouseListener(this);
        
        
        pectoral.setText("");
        espalda.setText("");
        cintura.setText("");
        biceps.setText("");
        triceps.setText("");
        antebrazo.setText("");
        gluteo.setText("");
        muslo.setText("");
        pantorrilla.setText("");
       
        
    }
    
    private boolean validarMedidas(){
        boolean validacion=false;
        if(pectoral.getText().equalsIgnoreCase("")||
                espalda.getText().equalsIgnoreCase("")||
                espalda.getText().equalsIgnoreCase("")||
                cintura.getText().equalsIgnoreCase("")||
                biceps.getText().equalsIgnoreCase("")||
                triceps.getText().equalsIgnoreCase("")||
                antebrazo.getText().equalsIgnoreCase("")||
                gluteo.getText().equalsIgnoreCase("")||
                muslo.getText().equalsIgnoreCase("")||
                pantorrilla.getText().equalsIgnoreCase("")){
            
      validacion = true;
        
           JOptionPane.showMessageDialog(this,"Faltan datos por completar","Muscle Home",0);
        }
        
        return validacion;
            
        }

   

 

    
    
    }


