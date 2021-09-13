/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import modelos.Categorias;
import modelos.CategoriasDAO;
import modelos.Jugador;
import modelos.JugadorDAO;
import vistas.VistaDatosJugador;
import vistas.VistaJuego;
import vistas.VistaPrincipal;
import vistas.VistaPuntajes;

/**
 *
 * @author CAROLINA
 */
public class ControladorPrincipal implements ActionListener {

    private VistaPrincipal vista;
    private VistaDatosJugador vistaDatos;
    private VistaJuego vistaJuegos;
    private VistaPuntajes vistaPuntaje;
    private JugadorDAO jugadorDAO;
    private CategoriasDAO categoriaDAO;

    public VistaPrincipal getVista() {
        return vista;
    }

    public void setVista(VistaPrincipal vista) {
        this.vista = vista;
    }

    public ControladorPrincipal(VistaPrincipal vista, VistaDatosJugador vista2, VistaJuego vista3, VistaPuntajes vista4) {
        this.vista = vista;
        this.vistaDatos = vista2;
        this.vistaJuegos = vista3;
        this.vistaPuntaje = vista4;
        this.vista.jButtonPlay.addActionListener(this);
        this.vista.jButtonTPuntajes.addActionListener(this);
        this.vista.jButtonSalir.addActionListener(this);
        this.vistaDatos.jButtonContinuar.addActionListener(this);
        this.vistaDatos.jButtonVolver.addActionListener(this);
        
        this.jugadorDAO = new JugadorDAO();
        this.categoriaDAO=new CategoriasDAO();
        this.cargarComboCategorias();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.vista.jButtonPlay) {
            this.vistaDatos.setVisible(true);
            this.vista.setVisible(false);

        };
        if (e.getSource() == this.vista.jButtonTPuntajes) {
            this.vistaPuntaje.setVisible(true);
        };
        if (e.getSource() == this.vista.jButtonSalir) {
            System.exit(0);
        };
        if (e.getSource() == this.vistaDatos.jButtonContinuar) {
            this.insertarNombreJugador();
            this.vistaJuegos.setVisible(true);
            this.vistaDatos.setVisible(false);
            
        };
        if (e.getSource() == this.vistaDatos.jButtonVolver) {
            this.vista.setVisible(true);
            this.vistaDatos.setVisible(false);
        };
        

    }

    public void insertarNombreJugador() {

        if (this.vistaDatos.jTextFieldNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vistaDatos, "Digite el campo nombre", "Campos Vacios", WARNING_MESSAGE);

        } else {
            Jugador v = new Jugador(this.vistaDatos.jTextFieldNombre.getText());

            if (this.jugadorDAO.insertarNombre(v)) {

                JOptionPane.showMessageDialog(this.vista, "Se ha insertado el nombre exitomente!!.", "registro Insertado", INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this.vista, "No se inserto registro.", "Error", ERROR_MESSAGE);

            }

        }

    }
    
    public void cargarComboCategorias(){
        
        DefaultComboBoxModel cb=new DefaultComboBoxModel();
        ArrayList<Categorias> categorias1=this.categoriaDAO.listarCategorias();
        
        categorias1.stream().map(r->r.getCategorias()).distinct().forEach(d->{
            cb.addElement(d);           
            
            
        });
        
        this.vistaDatos.jComboBoxCategorias.setModel(cb);
        
        
        
    }  
            
        
        }
        
        
       
        
    
    
    
    
    
    
    
    
    


