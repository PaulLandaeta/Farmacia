/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Paul Wilker Landaeta Flores paulwilkerlf@gmail.com
 */
public class Ventas {
    private Long id;
    private Date FechaVenta;
    private Double Total;
    private List<Medicamento> Medicamentos;

    public Ventas(Long id, Date FechaVenta, Double Total, List<Medicamento> Medicamentos) {
        this.id = id;
        this.FechaVenta = FechaVenta;
        this.Total = Total;
        this.Medicamentos = Medicamentos;
    }

    public Long getId() {
        return id;
    }

    public Date getFechaVenta() {
        return FechaVenta;
    }

    public Double getTotal() {
        return Total;
    }

    public List<Medicamento> getMedicamentos() {
        return Medicamentos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFechaVenta(Date FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public void setMedicamentos(List<Medicamento> Medicamentos) {
        this.Medicamentos = Medicamentos;
    }
    
}
