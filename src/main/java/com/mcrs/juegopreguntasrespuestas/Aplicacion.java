/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcrs.juegopreguntasrespuestas;

import controladores.ControladorPrincipal;
import vistas.VistaDatosJugador;
import vistas.VistaJuego;
import vistas.VistaPrincipal;
import vistas.VistaPuntajes;

/**
 *
 * @author CAROLINA
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VistaPrincipal vista=new VistaPrincipal();
       VistaDatosJugador vista2=new VistaDatosJugador();
       VistaJuego vista3=new VistaJuego();
       VistaPuntajes vista4=new VistaPuntajes();
       
       ControladorPrincipal cp=new ControladorPrincipal(vista,vista2,vista3,vista4); 
       vista.setVisible(true);
    }
    
}
