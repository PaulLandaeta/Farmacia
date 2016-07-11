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
public class Farmacia {
    private String nombre;
    private List<Bodega> bodega;
    private List<Ventas> ventas;

    public Farmacia(String nombre, List<Bodega> bodega, List<Ventas> ventas) {
        this.nombre = nombre;
        this.bodega = bodega;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Bodega> getBodega() {
        return bodega;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(List<Bodega> bodega) {
        this.bodega = bodega;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }
}
