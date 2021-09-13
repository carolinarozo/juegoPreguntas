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
public class Preguntas {
    private int id;
    private String pregunta;
    private String respuestaCorrecta;
    private Niveles nivel;
    private Categorias categoria;

   
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Niveles getNivel() {
        return nivel;
    }

    public void setNivel(Niveles nivel) {
        this.nivel = nivel;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Preguntas(String pregunta, String respuestaCorrecta, Niveles nivel, Categorias categoria) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.nivel = nivel;
        this.categoria = categoria;
    }
    
    
    
}
