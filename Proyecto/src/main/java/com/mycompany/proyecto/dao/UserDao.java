/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.dao;

import com.mycompany.proyecto.App;
import com.mycompany.proyecto.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author anaga
 */
public class UserDao {
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
    
    public User verUser(User u) throws SQLException{
        boolean encontrado =false;
        String sql = "select * from usuario where nombre = ? and contraseña = ?";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, u.getNombre());
        sentencia.setString(2, u.getPassword());
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {            
            u.setNombre(resultado.getString(2));
            u.setPassword(resultado.getString(3));
            encontrado = true;
        }
        if (encontrado) {
            return u;
        }else{
            return null;
        }
    }
    
    public void addUser(User u) throws SQLException{
        String sql="insert into usuario(nombre,contraseña)values(?,?)";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        
        sentencia.setString(1, u.getNombre());
        sentencia.setString(2,u.getPassword());
        ResultSet resultado = sentencia.executeQuery();
    }
    
    public void cambiarContraseña(User u) throws SQLException{
         String sql="update usuario set contraseña = ? where id=?";
         PreparedStatement sentencia = conexion.prepareStatement(sql);
         sentencia.setString(1,u.getPassword());
         sentencia.setInt(2,u.getId());
         sentencia.execute();
    }
}

