/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;

import com.mycompany.proyecto.Paciente;
import com.mycompany.proyecto.dao.PacienteDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author anaga
 */
public class SecondaryController {
      
    private static PacienteDao pdao;
    private Paciente pacienteSel;
    private static App a;
    
    @FXML
    private TextField Id;
    @FXML
    private TextField Nombre;
    @FXML
    private TextField Apellidos;
    @FXML
    private TextField Pieza;
    @FXML
    private TextField Color;
    @FXML
    private TextField Precio;
    @FXML
    private ListView listaPacientes;
    
    @FXML
    private ListView<String> lista;

    private final static ObservableList<String> items=FXCollections.observableArrayList ("Id","Nombre", "Apellidos","Pieza","Color","Precio");
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
  
    @FXML
    public void initLists() throws ClassNotFoundException, IOException{
       PacienteDao pacientes = new PacienteDao();
       listaPacientes.getItems().clear();
        try {
            pacientes.conectar();
            List<Paciente> Pacientes = pacientes.listaPacientes();
            listaPacientes.setItems(FXCollections.observableArrayList(Pacientes));
            

        } catch (SQLException sqle) {
            System.out.println("error");
        }
        
    }
    @FXML
    public void cargarPaciente( Paciente p){
        Integer.parseInt(Id.getText());
        Nombre.setText(p.getNombre());
        Apellidos.setText(p.getApellidos());
        Pieza.setText(p.getPieza());
        Color.setText(p.getColor());
        Precio.setText(p.getPrecio());
    }
    @FXML
    public void seleccionarPaciente(Event e){
        pacienteSel=(Paciente)listaPacientes.getSelectionModel().getSelectedItem();
        cargarPaciente(pacienteSel);
    }
    @FXML
    public void deletePaciente(){
        PacienteDao pacienteD = new PacienteDao();
        Paciente pacientes= new Paciente();
        pacientes.setId(Integer.valueOf(Id.getText()));
        pacientes.setNombre(Nombre.getText());
        pacientes.setApellidos(Apellidos.getText());
        pacientes.setPieza(Pieza.getText());
        pacientes.setColor(Color.getText());
        pacientes.setPrecio(Precio.getText());
        try {
            pacienteD.conectar();
            pacienteD.borrarPaciente(pacientes);
            System.out.println("Paciente eliminado");
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        
    }
    @FXML 
    public void newPaciente(){
        PacienteDao PacienteD = new PacienteDao();
        
        Paciente pacientes = new Paciente();
        pacientes.setId(Integer.valueOf(Id.getText()));
        pacientes.setNombre(Nombre.getText());
        pacientes.setApellidos(Apellidos.getText());
        pacientes.setPieza(Pieza.getText());
        pacientes.setColor(Color.getText());
        pacientes.setPrecio(Precio.getText());
        try{
             PacienteD.conectar();
            PacienteD.nuevopa(pacientes);
        } catch (Exception e) {
            System.out.println("error");
            System.out.println(e.getMessage());
        
    }
    }
}