/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.dao;

import com.mycompany.proyecto.App;
import com.mycompany.proyecto.Paciente;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/**
 *
 * @author anaga
 */
public class PacienteDao {
 private Connection conexion;
    
    public void conectar() throws ClassNotFoundException,SQLException,IOException{
        Properties configuration = new Properties();
        configuration.load(new FileInputStream(new File(App.class.getResource("ConectionBD.properties").getPath())));        
        String host = configuration.getProperty("host");
        String port = configuration.getProperty("port");
        String name = configuration.getProperty("name");
        String username = configuration.getProperty("username");
        String password = configuration.getProperty("password");

        conexion = DriverManager.getConnection("jdbc:mariadb://" + host + ":" + port + "/" + name + "?serverTimezone=UTC",
                username, password);
    }
    public void desconectar() throws SQLException {
        conexion.close();
    }
    public List<Paciente> listaPacientes() throws SQLException {
        List<Paciente> Pacientes = new ArrayList<>();
        String sql = "SELECT * FROM paciente";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            Paciente pacientes= new Paciente();
            pacientes.setId(resultado.getInt(1));
            pacientes.setNombre(resultado.getString(2));
            pacientes.setApellidos(resultado.getString(3));
            pacientes.setPieza(resultado.getString(4));
            pacientes.setColor(resultado.getString(5));
            pacientes.setPrecio(resultado.getString(6));

            Pacientes.add(pacientes);
        }
        return Pacientes;
    }
    
    public void borrarPaciente(Paciente p) throws SQLException{
        String sql = "delete from paciente where id =?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1,p.getId());
        sentencia.executeQuery();
    }
    public void nuevopa (Paciente p) throws SQLException{
        String sql="insert into paciente (id,nombre,apellidos,pieza,color,precio) values(?,?,?,?,?,?)";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        
        sentencia.setInt(1,p.getId());
        sentencia.setString(2,p.getNombre());
        sentencia.setString(3,p.getApellidos());
        sentencia.setString(4,p.getPieza());
        sentencia.setString(5,p.getColor());
        sentencia.setString(6,p.getPrecio());
        sentencia.executeQuery();
}
}
