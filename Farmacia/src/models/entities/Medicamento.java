/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.sql.Date;



/**
 *
 * @author plandaeta
 */
public class Medicamento {
    private Long id=null;
    private String name;
    private Laboratorio laboratorio;
    private Tipo tipo;
    private double precioUnitario;

    public Medicamento(Long id, String name, Laboratorio laboratorio, Tipo tipo, int cantidad, double precioUnitario) {
        this.id = id;
        this.name = name;
        this.laboratorio = laboratorio;
        this.tipo = tipo;
        this.precioUnitario = precioUnitario;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public Medicamento() {
    }

    public String getName() {
        return name;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
