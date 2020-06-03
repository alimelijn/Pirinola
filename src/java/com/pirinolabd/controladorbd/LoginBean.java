/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirinolabd.controladorbd;

import com.pirinolabd.controladorbd.util.JsfUtil;
import com.pirinolabd.modelobd.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Alison
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
    private String nombreJugador;
    private String apodoJugador;
    private Usuario usuarioAutenticado;
    @EJB
    private UsuarioFacade connUsuario;
    
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getApodoJugador() {
        return apodoJugador;
    }

    public void setApodoJugador(String apodoJugador) {
        this.apodoJugador = apodoJugador;
    }

    public Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(Usuario usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }
    
    public String ingresarSala(){
        Usuario usuarioencontrado = connUsuario.find(nombreJugador);
        if (usuarioencontrado!=null) {
            if (usuarioencontrado.getApodoJugador().equals(apodoJugador)) {
                usuarioAutenticado = usuarioencontrado;
                return "usuarios"; 
            }            
        }
        JsfUtil.addErrorMessage("erróneo");
        return "null";
    }  
    
    
    
}
