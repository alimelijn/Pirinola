/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirinola.controlador;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Alison
 */
@Named(value = "appBean")
@ApplicationScoped
public class AppBean {
    private int cont = 0;
    
    private String turnoJugador = "felipe";

    /**
     * Creates a new instance of AppBean
     */
    public AppBean() {
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void aumentarContador(){
        cont++;
    }
    
    public void aumentarContador(String nombreJugador){
        switch(nombreJugador){
            case "felipe":
                turnoJugador = "Alison Melisa Jimenez"; 
                break;
            default:
                turnoJugador = "felipe";           
        }
        cont++;
    }
    
    public boolean validarTurno(String nombreJugador){
        if(nombreJugador.equals(turnoJugador)) {
            return true;
        }
        return false;
    }
    
}
