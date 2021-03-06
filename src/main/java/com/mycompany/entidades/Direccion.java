/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "DIRECCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d"),
    @NamedQuery(name = "Direccion.findById", query = "SELECT d FROM Direccion d WHERE d.id = :id"),
    @NamedQuery(name = "Direccion.findByCalle", query = "SELECT d FROM Direccion d WHERE d.calle = :calle"),
    @NamedQuery(name = "Direccion.findByDepartamento", query = "SELECT d FROM Direccion d WHERE d.departamento = :departamento"),
    @NamedQuery(name = "Direccion.findByNumerodetelefono", query = "SELECT d FROM Direccion d WHERE d.numerodetelefono = :numerodetelefono"),
    @NamedQuery(name = "Direccion.findByNumerodecasa", query = "SELECT d FROM Direccion d WHERE d.numerodecasa = :numerodecasa")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="direccion_sec", sequenceName="sec_direccion", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="direccion_sec")
   
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 100)
    @Column(name = "CALLE")
    private String calle;
    @Size(max = 100)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Size(max = 100)
    @Column(name = "NUMERODETELEFONO")
    private String numerodetelefono;
    @Size(max = 20)
    @Column(name = "NUMERODECASA")
    private String numerodecasa;

    public Direccion() {
    }

    public Direccion(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNumerodetelefono() {
        return numerodetelefono;
    }

    public void setNumerodetelefono(String numerodetelefono) {
        this.numerodetelefono = numerodetelefono;
    }

    public String getNumerodecasa() {
        return numerodecasa;
    }

    public void setNumerodecasa(String numerodecasa) {
        this.numerodecasa = numerodecasa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entidades.Direccion[ id=" + id + " ]";
    }
    
}
