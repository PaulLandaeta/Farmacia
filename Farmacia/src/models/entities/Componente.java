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
@Table(name = "componente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Componente.findAll", query = "SELECT c FROM Componente c"),
    @NamedQuery(name = "Componente.findByIdComponente", query = "SELECT c FROM Componente c WHERE c.idComponente = :idComponente"),
    @NamedQuery(name = "Componente.findByNombreDelComponente", query = "SELECT c FROM Componente c WHERE c.nombreDelComponente = :nombreDelComponente")})
public class Componente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idComponente")
    private Integer idComponente;
    @Basic(optional = false)
    @Column(name = "nombreDelComponente")
    private String nombreDelComponente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "componente")
    private Collection<Producto> productoCollection;

    public Componente() {
    }

    public Componente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public Componente(Integer idComponente, String nombreDelComponente) {
        this.idComponente = idComponente;
        this.nombreDelComponente = nombreDelComponente;
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public String getNombreDelComponente() {
        return nombreDelComponente;
    }

    public void setNombreDelComponente(String nombreDelComponente) {
        this.nombreDelComponente = nombreDelComponente;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComponente != null ? idComponente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Componente)) {
            return false;
        }
        Componente other = (Componente) object;
        if ((this.idComponente == null && other.idComponente != null) || (this.idComponente != null && !this.idComponente.equals(other.idComponente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Componente[ idComponente=" + idComponente + " ]";
    }
    
}
