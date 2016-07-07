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
@Table(name = "unidaddemedida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidaddemedida.findAll", query = "SELECT u FROM Unidaddemedida u"),
    @NamedQuery(name = "Unidaddemedida.findByIdDeUnidadDeMedida", query = "SELECT u FROM Unidaddemedida u WHERE u.idDeUnidadDeMedida = :idDeUnidadDeMedida"),
    @NamedQuery(name = "Unidaddemedida.findByNombreDeLaUnidadDeMedida", query = "SELECT u FROM Unidaddemedida u WHERE u.nombreDeLaUnidadDeMedida = :nombreDeLaUnidadDeMedida")})
public class Unidaddemedida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDeUnidadDeMedida")
    private Integer idDeUnidadDeMedida;
    @Column(name = "nombreDeLaUnidadDeMedida")
    private String nombreDeLaUnidadDeMedida;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadDeMedida")
    private Collection<Producto> productoCollection;

    public Unidaddemedida() {
    }

    public Unidaddemedida(Integer idDeUnidadDeMedida) {
        this.idDeUnidadDeMedida = idDeUnidadDeMedida;
    }

    public Integer getIdDeUnidadDeMedida() {
        return idDeUnidadDeMedida;
    }

    public void setIdDeUnidadDeMedida(Integer idDeUnidadDeMedida) {
        this.idDeUnidadDeMedida = idDeUnidadDeMedida;
    }

    public String getNombreDeLaUnidadDeMedida() {
        return nombreDeLaUnidadDeMedida;
    }

    public void setNombreDeLaUnidadDeMedida(String nombreDeLaUnidadDeMedida) {
        this.nombreDeLaUnidadDeMedida = nombreDeLaUnidadDeMedida;
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
        hash += (idDeUnidadDeMedida != null ? idDeUnidadDeMedida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidaddemedida)) {
            return false;
        }
        Unidaddemedida other = (Unidaddemedida) object;
        if ((this.idDeUnidadDeMedida == null && other.idDeUnidadDeMedida != null) || (this.idDeUnidadDeMedida != null && !this.idDeUnidadDeMedida.equals(other.idDeUnidadDeMedida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Unidaddemedida[ idDeUnidadDeMedida=" + idDeUnidadDeMedida + " ]";
    }
    
}
