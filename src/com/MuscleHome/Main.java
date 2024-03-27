
package com.MuscleHome;

import com.MuscleHome.assets.conexion;
/**
 *
 * @author Juan Pablo Aguirre
 *          Camilo Sandoval 
 *          Harrisson Zapata
 */

public class Main {
    
      public static void main(String[] args) {

        Principal i = new Principal();
        i.show();
        
        System.out.println("Fecha del equipo: "+conexion.capturarFecha());
    }
}
