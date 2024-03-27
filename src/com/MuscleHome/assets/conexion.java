package com.MuscleHome.assets;
import java.awt.Image;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo Aguirre
 *          Camilo Sandoval 
 *          Harrisson Zapata
 */

public class conexion {

    public static Connection cnt;
    public static Statement consulta;
    public static ResultSet tabla = null;
    public static StringBuffer cadenaConcatenada[];
    public static StringBuffer cadenaConcatenadaBuffered;
    public static String cadena;
    public static PreparedStatement datos;
    public static ResultSetMetaData metadata;
    public static LinkedList lista;
    
    /*---------------------------------------*/
    private static ImageIcon imagen;
    public static String usuario;
    public static String nivel;
     
    public static Connection conectar (){ 
        try {

            Class.forName("com.mysql.jdbc.Driver");
            cnt = DriverManager.getConnection("jdbc:mysql://localhost/MuscleHome", "root", ""); /*WampServer*/

            // cnt = DriverManager.getConnection("jdbc:mysql:///MuscleHome","root","root"); /*MySql*/

            System.out.println("Conectada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
        return cnt;
    }
    public static void desconectar(){
      try {
                consulta.close();
                cnt.close();
            } catch (SQLException sqlException) {
                JOptionPane.showMessageDialog(null,
                        sqlException.getMessage(), "Database Error",
                        JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
    
    }
     /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
   
    public static void insertarUsuario(String nombres, String apellidos, String correo, int edad, String sexo, String usuario, String contraseña, String nivelEsperiencia, int codigoRutina) {

        conectar();

        try {
            consulta = cnt.createStatement();
            String datosUsuario = "INSERT INTO usuarios VALUES (?,?,?,?,?,?,?,?,?)";
            datos = cnt.prepareStatement(datosUsuario);
            // consulta a la base de datos
            datos.setString(1, nombres);
            datos.setString(2, apellidos);
            datos.setString(3, correo);
            datos.setInt(4, edad);
            datos.setString(5, sexo);
            datos.setString(6, usuario);
            datos.setString(7, contraseña);
            datos.setString(8, nivelEsperiencia);
            datos.setInt(9, codigoRutina);
            int n = datos.executeUpdate();
            if (n > 0) {
                System.out.println("Exitoso");
            }
        } // end try // end try
        catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, sqlException.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } desconectar();
        System.out.println("Usuario: " + usuario + contraseña);

    }

    public static boolean login(String usuario, String contraseña) {

        conectar();
        boolean isRegistrado = false;

        try {

            consulta = cnt.createStatement();
            tabla = consulta.executeQuery("SELECT usuario,contrasena FROM usuarios WHERE usuario='" + usuario + "'AND contrasena='" + contraseña + "'");

            if (tabla.next()) {
                isRegistrado = true;
            } else {
                System.out.println("Contraseña o usuario incorrecto");
            }

        } catch (SQLException sqlException) {

            JOptionPane.showMessageDialog(null, sqlException.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);

            System.exit(1);

        } desconectar();

        conexion.usuario = usuario;
        return isRegistrado;
    }

    public static void insertarMedida(float magnitud, String nombreMusculo, String usuario) {

        conectar();

        try {
            consulta = cnt.createStatement();
            String medidasUsuario = "INSERT INTO medidas(magnitud,fecha,nombreMusculo,usuarioUsuario) VALUES(?,?,?,?)";
            datos = cnt.prepareStatement(medidasUsuario);
         // consulta a la base de datos

            datos.setFloat(1, magnitud);
            datos.setString(2, capturarFecha());
            datos.setString(3, nombreMusculo);
            datos.setString(4, usuario);
            int n = datos.executeUpdate() - 1;
            if (n > 0) {
                System.out.println("Exitoso");
            }

        } // end try // end try
        catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, sqlException.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } desconectar();
        System.out.println("Usuario: " + usuario + " Musculo: " + nombreMusculo + " Medida: " + magnitud + " Fecha: " + capturarFecha());
    }

    public static boolean validacionRegistro(String usuario) {

        conectar();
        boolean isRegistrado = false;

        try {

            consulta = cnt.createStatement();
            tabla = consulta.executeQuery("SELECT usuario FROM usuarios WHERE usuario='" + usuario + "'");

            if (tabla.next()) {
                isRegistrado = true;
            } else {
                System.out.println("Contraseña o usuario incorrecto");
            }

        } catch (SQLException sqlException) {

            JOptionPane.showMessageDialog(null, sqlException.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);

            System.exit(1);

        } desconectar();

        return isRegistrado;

    }

    public static String capturarFecha() {

        Calendar fechaSistema = new GregorianCalendar();
        Date fecha = new Date(fechaSistema.get(Calendar.YEAR), fechaSistema.get(Calendar.MONTH), fechaSistema.get(Calendar.DAY_OF_MONTH));
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        return formato.format(fecha);

    }

    public static ImageIcon llamarTip(int numeroTip) {

        try {
            conectar();
            String sSql = "select*from tips where  consecutivo =" + numeroTip + ";";

            consulta = cnt.createStatement();
            tabla = consulta.executeQuery(sSql);
            if (tabla.next()) {

                Image i = null;
                Blob blob = tabla.getBlob("archivoImagen");
                i = javax.imageio.ImageIO.read(blob.getBinaryStream());
                imagen = new ImageIcon(i);

            }
        } catch (SQLException | IOException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        return imagen;
        

    }

    public static String obtenerUsuario() {
        return usuario;
    }

    public static StringBuffer[] consultarEjecuciones(int codigoRutina,int dia) {

        String intensidad = "";
        if(codigoRutina ==1 ){intensidad = "novato";}
        if(codigoRutina ==2 ){intensidad = "avanzado";}
        if(codigoRutina ==3 ){intensidad = "experimentado";}
        
        conectar();
      
   

        try {
            consulta = cnt.createStatement();
            tabla = consulta.executeQuery("SELECT nombreEjercicio, numeroSeries, repeticiones, tiempoDescanso FROM ejecuciones WHERE numeroDia= " + dia + " AND intensidad='" + intensidad + "'");
            metadata = tabla.getMetaData();

            int numberOfColumns = metadata.getColumnCount();
            
            cadenaConcatenada = new StringBuffer[100];
      
        
                 int j= 0;
                 while (tabla.next()) {
       
                    for (int i = 1; i <= numberOfColumns; i++) {
                        
                        cadenaConcatenada[j] = new StringBuffer().append(tabla.getObject(i)+ "   ");
                        System.out.println(cadenaConcatenada[j].toString());
                        j++;
                    }

                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }desconectar();

        return cadenaConcatenada;
    }

    public static String consultarNivelExperienciaUsuario(String usuario) {
        conectar();

        try {
            consulta = cnt.createStatement();
            tabla = consulta.executeQuery("SELECT*FROM usuarios WHERE usuario='" + usuario + "'");

            if (tabla.next()) {
                nivel = tabla.getString("nivelExperiencia");

            }
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } desconectar();

        System.out.println("Nivel actual: " + nivel);
        return nivel;
    }

    public static void modificarNivelExperienciaUsuario(String nivelExperiencia) {

        conectar();

        try {
            consulta = cnt.createStatement();
            String remplazo = "update usuarios SET nivelExperiencia='" + nivelExperiencia + "' WHERE usuario='" + conexion.obtenerUsuario() + "'";
            datos = cnt.prepareStatement(remplazo);
            datos.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } desconectar();

        System.out.println("Ahora eres: " + nivel);
    }

    public static void modificarMedida(float magnitud, String nombreMusculo, String usuario) {

        conectar();

        try {
            consulta = cnt.createStatement();
            String remplazo = "update medidas SET magnitud='" + magnitud + "' WHERE usuarioUsuario='" + usuario + "' AND nombreMusculo='" + nombreMusculo + "'";
            datos = cnt.prepareStatement(remplazo);
            int n = datos.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } desconectar();
        System.out.println(nombreMusculo + " ---> " + magnitud);

    }

    public static String obtenerHistorialMedidas(String usuario) {

        conectar();
        float saltoLinea = 0;

        try {
            consulta = cnt.createStatement();
            tabla = consulta.executeQuery("SELECT nombreMusculo, magnitud, fecha FROM medidas WHERE usuarioUsuario='" + usuario + "'");

            if (tabla.next()) {

                cadenaConcatenadaBuffered = new StringBuffer();
                metadata = tabla.getMetaData();
                int numberOfColumns = metadata.getColumnCount();

                while (tabla.next()) {
                    for (int i = 1; i <= numberOfColumns; i++) {

                        cadenaConcatenadaBuffered.append(tabla.getObject(i) + "\t" + "\t");
                        saltoLinea++;
                        if (saltoLinea % 3 == 0) {
                            cadenaConcatenadaBuffered.append("\n");
                        }

                    }
                    
                 
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } desconectar();

        System.out.println("Nivel actual: " + nivel);
        return cadenaConcatenadaBuffered.toString();

    }

    public static ImageIcon  llamarContenidoMM(String nombreEjercicio){
    
           try {
            conectar();
            String sSql = "select*from contenidosMM where  nombreEjercicio='" + nombreEjercicio + "'";

            consulta = cnt.createStatement();
            tabla = consulta.executeQuery(sSql);
            if (tabla.next()) {

                Image i = null;
                Blob blob = tabla.getBlob("archivo");
                i = javax.imageio.ImageIO.read(blob.getBinaryStream());
                imagen = new ImageIcon(i);

            }
        } catch (SQLException | IOException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        return imagen;
    
    }
    
    /*obsoleto*/public static boolean isLLamarConenido(String nombre, int dia, int codigoRutina, String nombreComparacion){
    
        boolean validacion = false;
        
        String intensidad = "";
        if(codigoRutina ==1 ){intensidad = "novato";}
        if(codigoRutina ==2 ){intensidad = "avanzado";}
        if(codigoRutina ==3 ){intensidad = "experimentado";}
        
        conectar();
      
   

        try {
            consulta = cnt.createStatement();
            tabla = consulta.executeQuery("SELECT nombreEjercicio FROM ejecuciones WHERE nombreEjercicio='" + nombre + "' AND intensidad='" + intensidad + "' AND dia =" + dia);
            metadata = tabla.getMetaData();

            int numberOfColumns = metadata.getColumnCount();

            cadena = new String();
            
                 while (tabla.next()) {
       
                    for (int i = 1; i <= numberOfColumns; i++) {
                        
                        cadena = tabla.getObject(i).toString();
                        if(cadena.equalsIgnoreCase(nombreComparacion)){
                        validacion = true;     }

                    }

                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }desconectar();

        return validacion;
    }
    
    public static String obtenerProgresoMusculo(String nombreMusculo, String usuario){
    
        float inicial = 0;
        float fina = 0;
        float progreso = 0;
        
            conectar();
            
        try {
            int numberOfColumns = metadata.getColumnCount();
            consulta = cnt.createStatement();
            tabla = consulta.executeQuery("SELECT*FROM medidas WHERE usuarioUsuario='" + usuario + "' AND nombreMusculo='" +nombreMusculo+  "'");
            metadata = tabla.getMetaData();
            System.out.println(numberOfColumns);
            
             if (tabla.first()) {
                inicial = tabla.getFloat("magnitud");
             }
             
             if(tabla.last()){
              fina = tabla.getFloat("magnitud");
             }
         
              progreso =   (int)(fina * 100) /  (inicial) - 100;
       
    }   catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
                 desconectar();
                 
                String tmp =  String.format("%.1f", progreso);
                tmp = tmp + "%";

         return tmp;
        
    }
    


    
}




   

     
        
      

        



         