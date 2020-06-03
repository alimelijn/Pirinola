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
public class Usuario implements Serializable{
    private short codigo;
    private String nombreJugador;
    private String apodoJugador;
    private int numeroSala;
    private int apuestaJugador=1500;

    public Usuario() {
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

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getApuestaJugador() {
        return apuestaJugador;
    }

    public void setApuestaJugador(int apuestaJugador) {
        this.apuestaJugador = apuestaJugador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }
}
