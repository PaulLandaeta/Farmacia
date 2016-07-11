/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.sql.Date;

/**
 *
 * @author Paul Wilker Landaeta Flores paulwilkerlf@gmail.com
 */
public class Ingreso {
    private Long id;
    private Long id_medicamento;
    private Long cantidad;
    private Date fechaIngreso;
    private Date fechaExpiracion;

    public Ingreso(Long id, Long id_medicamento, Long cantidad) {
        this.id = id;
        this.id_medicamento = id_medicamento;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public Long getId_medicamento() {
        return id_medicamento;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId_medicamento(Long id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }
}
