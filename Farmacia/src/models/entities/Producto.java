/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author plandaeta
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByIdMedicamento", query = "SELECT p FROM Producto p WHERE p.productoPK.idMedicamento = :idMedicamento"),
    @NamedQuery(name = "Producto.findByIdComponente", query = "SELECT p FROM Producto p WHERE p.productoPK.idComponente = :idComponente"),
    @NamedQuery(name = "Producto.findByCantidadDelComponente", query = "SELECT p FROM Producto p WHERE p.cantidadDelComponente = :cantidadDelComponente")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductoPK productoPK;
    @Basic(optional = false)
    @Column(name = "cantidadDelComponente")
    private double cantidadDelComponente;
    @JoinColumn(name = "idUnidadDeMedida", referencedColumnName = "idDeUnidadDeMedida")
    @ManyToOne(optional = false)
    private Unidaddemedida idUnidadDeMedida;
    @JoinColumn(name = "idComponente", referencedColumnName = "idComponente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Componente componente;
    @JoinColumn(name = "idMedicamento", referencedColumnName = "idMedicamento", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Medicamento medicamento;

    public Producto() {
    }

    public Producto(ProductoPK productoPK) {
        this.productoPK = productoPK;
    }

    public Producto(ProductoPK productoPK, double cantidadDelComponente) {
        this.productoPK = productoPK;
        this.cantidadDelComponente = cantidadDelComponente;
    }

    public Producto(int idMedicamento, int idComponente) {
        this.productoPK = new ProductoPK(idMedicamento, idComponente);
    }

    public ProductoPK getProductoPK() {
        return productoPK;
    }

    public void setProductoPK(ProductoPK productoPK) {
        this.productoPK = productoPK;
    }

    public double getCantidadDelComponente() {
        return cantidadDelComponente;
    }

    public void setCantidadDelComponente(double cantidadDelComponente) {
        this.cantidadDelComponente = cantidadDelComponente;
    }

    public Unidaddemedida getIdUnidadDeMedida() {
        return idUnidadDeMedida;
    }

    public void setIdUnidadDeMedida(Unidaddemedida idUnidadDeMedida) {
        this.idUnidadDeMedida = idUnidadDeMedida;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoPK != null ? productoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.productoPK == null && other.productoPK != null) || (this.productoPK != null && !this.productoPK.equals(other.productoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Producto[ productoPK=" + productoPK + " ]";
    }
    
}
