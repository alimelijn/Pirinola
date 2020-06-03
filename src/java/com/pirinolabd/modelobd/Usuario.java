/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirinolabd.modelobd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alison
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByNombreJugador", query = "SELECT u FROM Usuario u WHERE u.nombreJugador = :nombreJugador")
    , @NamedQuery(name = "Usuario.findByApodoJugador", query = "SELECT u FROM Usuario u WHERE u.apodoJugador = :apodoJugador")
    , @NamedQuery(name = "Usuario.findByNumeroSala", query = "SELECT u FROM Usuario u WHERE u.numeroSala = :numeroSala")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre_jugador")
    private String nombreJugador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "apodo_jugador")
    private String apodoJugador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_sala")
    private int numeroSala;
    @JoinColumn(name = "tipo_usuario", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private TipoUsuario tipoUsuario;

    public Usuario() {
    }

    public Usuario(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Usuario(String nombreJugador, String apodoJugador, int numeroSala) {
        this.nombreJugador = nombreJugador;
        this.apodoJugador = apodoJugador;
        this.numeroSala = numeroSala;
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

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreJugador != null ? nombreJugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.nombreJugador == null && other.nombreJugador != null) || (this.nombreJugador != null && !this.nombreJugador.equals(other.nombreJugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pirinolabd.modelobd.Usuario[ nombreJugador=" + nombreJugador + " ]";
    }
    
}
