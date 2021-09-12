/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcrs.juegopreguntasrespuestas;

import controladores.ControladorPrincipal;
import vistas.VistaDatosJugador;
import vistas.VistaPrincipal;

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
       ControladorPrincipal cp=new ControladorPrincipal(vista,vista2); 
       vista.setVisible(true);
    }
    
}
