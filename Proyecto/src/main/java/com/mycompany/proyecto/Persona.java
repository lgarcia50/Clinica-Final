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
public class  Persona {
   private  int id;
   private String Nombre;
   private String Apellidos;
  
    public Persona(int id, String nombre, String Apelllidos) throws SQLException {
//       DBQueries.execUpdate("INSERT INTO dentist values(" + id + ", '" + name+ "', '" + age
//					+ "', '" + gender + "', '" + address + "', '" + phone
//					+ "', '" + bloodgroup + "', '" + speciality + "')");
//        
        this.id = id;
        this.Nombre = nombre;
        this.Apellidos= Apellidos;
      
    }

     public Persona() {
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre ;
    }

    public void setNombre(String Nombre) {
        this.Nombre= Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        this.Apellidos = Apellidos;
    }
}

