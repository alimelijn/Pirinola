/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirinola.modelo;

import java.io.Serializable;

/**
 *
 * @author Alison
 */
public class Sala implements Serializable{
    private Usuario usuario;
    private Pirinola pirinola;
    private int apuestaGeneral;
    private short numeroSala;

    public Sala() {
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pirinola getPirinola() {
        return pirinola;
    }

    public void setPirinola(Pirinola pirinola) {
        this.pirinola = pirinola;
    }

    public int getApuestaGeneral() {
        return apuestaGeneral;
    }

    public void setApuestaGeneral(int apuestaGeneral) {
        this.apuestaGeneral = apuestaGeneral;
    }

    public short getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(short numeroSala) {
        this.numeroSala = numeroSala;
    }
    
    
    
}
