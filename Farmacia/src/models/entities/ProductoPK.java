/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author plandaeta
 */
@Embeddable
public class ProductoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idMedicamento")
    private int idMedicamento;
    @Basic(optional = false)
    @Column(name = "idComponente")
    private int idComponente;

    public ProductoPK() {
    }

    public ProductoPK(int idMedicamento, int idComponente) {
        this.idMedicamento = idMedicamento;
        this.idComponente = idComponente;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idMedicamento;
        hash += (int) idComponente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoPK)) {
            return false;
        }
        ProductoPK other = (ProductoPK) object;
        if (this.idMedicamento != other.idMedicamento) {
            return false;
        }
        if (this.idComponente != other.idComponente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.ProductoPK[ idMedicamento=" + idMedicamento + ", idComponente=" + idComponente + " ]";
    }
    
}
