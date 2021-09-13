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
public class Categorias {
    
    private int id;
    private String categorias;

    

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public Categorias(String categorias) {
        this.categorias = categorias;
    }

    public Categorias() {
    }
    
    
    
}
