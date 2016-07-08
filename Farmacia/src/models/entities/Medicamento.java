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
    private String laboratorio;
    private String tipo;
    private Date dateExpired;

    public Medicamento() {
    }

    public String getName() {
        return name;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getDateExpired() {
        return dateExpired;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDateExpired(Date dateExpired) {
        this.dateExpired = dateExpired;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medicamento(Long id, String name, String laboratorio, String tipo, Date dateExpired) {
        this.id = id;
        this.name = name;
        this.laboratorio = laboratorio;
        this.tipo = tipo;
        this.dateExpired = dateExpired;
    }
    
}
