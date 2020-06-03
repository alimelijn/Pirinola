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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alison
 */
@Entity
@Table(name = "sala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s")
    , @NamedQuery(name = "Sala.findByNumeroSala", query = "SELECT s FROM Sala s WHERE s.numeroSala = :numeroSala")
    , @NamedQuery(name = "Sala.findByApuestaGeneral", query = "SELECT s FROM Sala s WHERE s.apuestaGeneral = :apuestaGeneral")})
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_sala")
    private Integer numeroSala;
    @Column(name = "apuesta_general")
    private Integer apuestaGeneral;

    public Sala() {
    }

    public Sala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Integer getApuestaGeneral() {
        return apuestaGeneral;
    }

    public void setApuestaGeneral(Integer apuestaGeneral) {
        this.apuestaGeneral = apuestaGeneral;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroSala != null ? numeroSala.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.numeroSala == null && other.numeroSala != null) || (this.numeroSala != null && !this.numeroSala.equals(other.numeroSala))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pirinolabd.modelobd.Sala[ numeroSala=" + numeroSala + " ]";
    }
    
}
