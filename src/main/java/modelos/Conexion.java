/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CAROLINA
 */
public class Conexion {
    
    private Connection con;
    
    
    public Connection getCon(){

            try {
                String rutaActual=System.getProperty("user.dir");
                
                Class.forName("org.sqlite.JDBC");
                this.con=DriverManager.getConnection("jdbc:sqlite:"+rutaActual+"\\preguntasRespuestas.db");
                
            } catch (Exception e) {
                
                System.out.println("Se ha producido un error en el metodo getCon: "+e.getMessage());
            }
            
            return this.con;
    }
    
}
