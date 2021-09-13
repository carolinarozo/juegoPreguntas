/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author CAROLINA
 */
public class JugadorDAO {

    private Conexion conectar;
    private Connection conSql;
    private PreparedStatement ps;
    private ResultSet rs;

    public JugadorDAO() {
        this.conectar = new Conexion();
    }

    public boolean insertarNombre(Jugador jugador) {

        boolean registroInsertado = false;
        String consultaSQL = "INSERT INTO jugador (nombre) VALUES (?)";
        try {

            this.conSql = this.conectar.getCon();
            this.ps = this.conSql.prepareStatement(consultaSQL);
            this.ps.setString(1, jugador.getNombre());

            if (this.ps.executeUpdate() > 0) {

                registroInsertado = true;

            }

        } catch (Exception e) {
            System.out.println("Error en el metodo insertar registros" + e.getMessage());
        }

        return registroInsertado;

    }

    public boolean insertarPuntaje(Jugador jugador) {

        boolean registroInsertado = false;
        String consultaSQL = "UPDATE jugador SET puntage = ? WHERE nombre=?";
        try {

            this.conSql = this.conectar.getCon();
            this.ps = this.conSql.prepareStatement(consultaSQL);
            this.ps.setString(1, jugador.getPuntage());
            this.ps.setString(2, jugador.getNombre());

            if (this.ps.executeUpdate() > 0) {

                registroInsertado = true;

            }

        } catch (Exception e) {
            System.out.println("Error en el metodo insertar registros" + e.getMessage());
        }

        return registroInsertado;

    }

}
