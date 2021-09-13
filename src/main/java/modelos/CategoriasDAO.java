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
public class CategoriasDAO {
    
    private Conexion conectar;
    private Connection conSql;
    private PreparedStatement ps;
    private ResultSet rs;

    public CategoriasDAO() {
         this.conectar = new Conexion();
        
    }
    
    public ArrayList<Categorias> listarCategorias() {

        String consultaSQL = "SELECT * FROM categorias";
        ArrayList<Categorias> categoria = new ArrayList<Categorias>();

        try {

            this.conSql = this.conectar.getCon();
            this.ps = this.conSql.prepareStatement(consultaSQL);
            this.rs = this.ps.executeQuery();
            while (this.rs.next()) {

                Categorias v = new Categorias(this.rs.getString("categoria"));
                categoria.add(v);
            }

        } catch (Exception e) {
            System.out.println("Error en el metodo consultar registros" + e.getMessage());
        }

        return categoria;

    }
    
    public ArrayList<Categorias> consultarRegistro(String categoria) {

        String consultaSQL = "SELECT * FROM categorias WHERE categoria=?";
        ArrayList<Categorias> categorias1 = new ArrayList<Categorias>();

        try {

            this.conSql = this.conectar.getCon();
            this.ps = this.conSql.prepareStatement(consultaSQL);
            this.ps.setString(1, categoria);
            this.rs = this.ps.executeQuery();
            while (this.rs.next()) {

                Categorias c = new Categorias(Integer.valueOf(this.rs.getString("id")), this.rs.getString("categoria"));
                categorias1.add(c);
            }

        } catch (Exception e) {
            System.out.println("Error en el metodo consultar registros" + e.getMessage());
        }

        return categorias1;

    }
    
    
    
}
