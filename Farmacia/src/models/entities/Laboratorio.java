/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author plandaeta
 */
@Entity
@Table(name = "laboratorio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Laboratorio.findAll", query = "SELECT l FROM Laboratorio l"),
    @NamedQuery(name = "Laboratorio.findByIdLaboratorio", query = "SELECT l FROM Laboratorio l WHERE l.idLaboratorio = :idLaboratorio"),
    @NamedQuery(name = "Laboratorio.findByNombreDelLaboratorio", query = "SELECT l FROM Laboratorio l WHERE l.nombreDelLaboratorio = :nombreDelLaboratorio")})
public class Laboratorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLaboratorio")
    private Integer idLaboratorio;
    @Basic(optional = false)
    @Column(name = "nombreDelLaboratorio")
    private String nombreDelLaboratorio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLaboratorio")
    private Collection<Medicamento> medicamentoCollection;

    public Laboratorio() {
    }

    public Laboratorio(Integer idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public Laboratorio(Integer idLaboratorio, String nombreDelLaboratorio) {
        this.idLaboratorio = idLaboratorio;
        this.nombreDelLaboratorio = nombreDelLaboratorio;
    }

    public Integer getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(Integer idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getNombreDelLaboratorio() {
        return nombreDelLaboratorio;
    }

    public void setNombreDelLaboratorio(String nombreDelLaboratorio) {
        this.nombreDelLaboratorio = nombreDelLaboratorio;
    }

    @XmlTransient
    public Collection<Medicamento> getMedicamentoCollection() {
        return medicamentoCollection;
    }

    public void setMedicamentoCollection(Collection<Medicamento> medicamentoCollection) {
        this.medicamentoCollection = medicamentoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLaboratorio != null ? idLaboratorio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laboratorio)) {
            return false;
        }
        Laboratorio other = (Laboratorio) object;
        if ((this.idLaboratorio == null && other.idLaboratorio != null) || (this.idLaboratorio != null && !this.idLaboratorio.equals(other.idLaboratorio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Laboratorio[ idLaboratorio=" + idLaboratorio + " ]";
    }
    
}
