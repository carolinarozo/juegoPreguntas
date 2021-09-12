/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.VistaDatosJugador;
import vistas.VistaPrincipal;

/**
 *
 * @author CAROLINA
 */
public class ControladorPrincipal implements ActionListener {
    
    private VistaPrincipal vista;
    private VistaDatosJugador vistaDatos;

    public VistaPrincipal getVista() {
        return vista;
    }

    public void setVista(VistaPrincipal vista) {
        this.vista = vista;
    }

    public ControladorPrincipal(VistaPrincipal vista, VistaDatosJugador vista2) {
        this.vista = vista;
        this.vistaDatos=vista2;
        this.vista.jButtonPlay.addActionListener(this);
        this.vista.jButtonTPuntajes.addActionListener(this);
        this.vista.jButtonSalir.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.vista.jButtonPlay) {
            this.vistaDatos.setVisible(true);
            
        };
        if (e.getSource() == this.vista.jButtonTPuntajes) {
        };
        if (e.getSource() == this.vista.jButtonSalir) {
            System.exit(0);
        };    

       
    }
    
    
    
    
}

    


