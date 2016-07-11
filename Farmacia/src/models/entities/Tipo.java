/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

/**
 *
 * @author plandaeta
 */
public class Tipo {
    private Long id;
    private String nombre;
    private int cantidad;
    private double peso;

    public Tipo(Long id, String nombre, int cantidad, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
