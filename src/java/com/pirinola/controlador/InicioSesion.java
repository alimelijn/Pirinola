/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirinola.controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Alison
 */
@Named(value = "inicioSesion")
@SessionScoped
public class InicioSesion implements Serializable {
    private String nombreJugador;
    private String apodoJugador;
//    @EJB
//    private UsuarioFacade connUsuario;

    /**
     * Creates a new instance of InicioSesion
     */
    public InicioSesion() {
    }
    
}
