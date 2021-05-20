/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;

import com.mycompany.proyecto.dao.UserDao;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author anaga
 */
public class RegistroController {
    
 @FXML
    private TextField nombreUsuario;
    @FXML
    private PasswordField contraseniaUsuario;
    @FXML
    private TextField preguntaUsuario;
    @FXML
    private TextField respuestaUsuario;
    @FXML
    private Label mensaje;
    
     private static UserDao udao;
     
    @FXML
    public void registar() throws IOException, SQLException{
        String nombre=nombreUsuario.getText();
        String password=contraseniaUsuario.getText();
        User alta=new User(nombre,password);
       // mensaje.setText("Hasta aqui ok");
       try {
            udao= new UserDao();
            udao.conectar();
            udao.addUser(alta);
            mensaje.setText("Usuario dado de Alta");
        } catch (Exception e) {
            mensaje.setText(e.getMessage());
        }
        
        
    }
    @FXML
    public void atras() throws IOException{
        App.setRoot("primary");
    }
}


    


