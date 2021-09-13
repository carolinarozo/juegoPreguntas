/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CAROLINA
 */
public class Jugador {
    private int id;
    private String nombre;
    private String puntage;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntage() {
        return puntage;
    }

    public void setPuntage(String puntage) {
        this.puntage = puntage;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        
    }

    public Jugador() {
    }
    
    
}
