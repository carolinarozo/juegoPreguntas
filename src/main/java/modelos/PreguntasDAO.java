/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author CAROLINA
 */
public class PreguntasDAO {
    
    private Conexion conectar;
    private Connection conSql;
    private PreparedStatement ps;
    private ResultSet rs;

    public PreguntasDAO() {
         this.conectar = new Conexion();
        
    }
    
    public ArrayList<Preguntas> consultarRegistro() {

        String consultaSQL = "SELECT * FROM preguntas";
        ArrayList<Preguntas> preguntas1 = new ArrayList<Preguntas>();

        try {

            this.conSql = this.conectar.getCon();
            this.ps = this.conSql.prepareStatement(consultaSQL);
            this.rs = this.ps.executeQuery();
            while (this.rs.next()) {
                
                Niveles nivel=new Niveles(this.rs.getString("id_niveles"));
                Categorias categoria=new Categorias(this.rs.getString("id_categorias"));

                Preguntas p = new Preguntas(this.rs.getString("pregunta"), this.rs.getString("respuesta_correcta"), nivel, categoria);
                preguntas1.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error en el metodo consultar registros" + e.getMessage());
        }

        return preguntas1;

    }
    
}
