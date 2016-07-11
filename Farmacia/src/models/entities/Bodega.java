/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.util.List;

/**
 *
 * @author Paul Wilker Landaeta Flores paulwilkerlf@gmail.com
 */
public class Bodega {
    public Long id;
    public Long id_medicamento;
    public List<Ingreso> ingresos;

    public Bodega(Long id, Long id_medicamento, List<Ingreso> ingresos) {
        this.id = id;
        this.id_medicamento = id_medicamento;
        this.ingresos = ingresos;
    }

    public Long getId() {
        return id;
    }

    public Long getId_medicamento() {
        return id_medicamento;
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId_medicamento(Long id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public void setIngresos(List<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }
    
}
