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
    
}
