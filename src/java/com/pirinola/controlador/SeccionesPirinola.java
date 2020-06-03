/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirinola.controlador;

import com.pirinola.modelo.Usuario;
import com.pirinola.modelo.Sala;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Alison
 */
@Named(value = "seccionesPirinola")
@SessionScoped
public class SeccionesPirinola implements Serializable {
    private Usuario usuario;
    private Sala sala;

    /**
     * Creates a new instance of SeccionesPirinola
     */
    public SeccionesPirinola() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public void ponUno(){
        
    }
    
    
}
