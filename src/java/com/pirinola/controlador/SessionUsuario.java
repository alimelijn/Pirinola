/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirinola.controlador;

import com.pirinola.modelo.ListaUsuarios;
import com.pirinola.modelo.Sala;
import com.pirinola.modelo.Usuario;
import com.pirinola.utilidades.JsfUtil;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Alison
 */
@Named(value = "sessionUsuario")
@Dependent
public class SessionUsuario implements Serializable{
    private Usuario usuario;
    private ListaUsuarios listaUsu;
    private Sala sala;
    private String alInicio="1";
   
    /**
     * Creates a new instance of SessionUsuario
     */
    public SessionUsuario() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ListaUsuarios getListaUsu() {
        return listaUsu;
    }

    public void setListaUsu(ListaUsuarios listaUsu) {
        this.listaUsu = listaUsu;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getAlInicio() {
        return alInicio;
    }

    public void setAlInicio(String alInicio) {
        this.alInicio = alInicio;
    }
    
    
    public void crearSala(){
        usuario.setCodigo((short)(listaUsu.contarNodos()+1));
        if(alInicio.compareTo("1")==0)
        {
            listaUsu.adicionarNodoAlInicio(usuario);
        }
        else
        {
            listaUsu.adicionarNodo(usuario);
        }  
        
        JsfUtil.addSuccessMessage("El infante se ha guardado exitosamente");
        
    }
    
}
