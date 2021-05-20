/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;

import java.sql.SQLException;

/**
 *
 * @author anaga
 */
public class Paciente  extends Persona{
    
     private String nombre;
     private String apellidos;
     private String pieza;
     private String color;
     private String precio;
     protected int id;
   public Paciente() {}
     public Paciente(int id, String nombre, String  apellidos, String pieza, String color, String precio) throws SQLException {
//         DBQueries.execUpdate("INSERT INTO patient values(" + id + ", '" + nombre+ "', '" + apellidos
//					+ "', '" + pieza + "', '" + color + "', '" + precios
//					+ "',)
      this.id = id;
       this.nombre = nombre;
        this.apellidos = apellidos;
        this.pieza= pieza;
        this.color = color;
        this.precio = precio;
    }

 


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio){
        this.precio=precio;
    }

    public void setPhone(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", pieza=" + pieza + ", color=" + color + ", precio=" + precio + ", id=" + id + '}';
    }
   
    
}


