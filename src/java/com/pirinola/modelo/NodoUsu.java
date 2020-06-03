/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirinola.modelo;

/**
 *
 * @author Alison
 */
public class NodoUsu {
    private Usuario dato;
    private NodoUsu siguiente;

    public NodoUsu(Usuario dato) {
        this.dato = dato;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public NodoUsu getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsu siguiente) {
        this.siguiente = siguiente;
    }
    
    
} 
