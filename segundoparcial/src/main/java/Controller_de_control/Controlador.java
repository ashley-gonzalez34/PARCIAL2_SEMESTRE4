/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_de_control;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Controlador {
    
    public boolean verificar_String(String cadena){ //este metodo hace que este al control de estar verificando esta cadena
        boolean access;
        if(cadena!=null){//y se vaya alamcenando los caracteres 
            access=true;    
        }
        else {
            access=false;
        }
        return access;
    }
    public boolean verifiar_int(String cadena){
        boolean access;
        if (cadena.matches("-?\\d+")&& cadena!=null){//almacena los caracteres enteros
            access=true;
    }
        else{
            access=false;
        }
        return access;
    }
    public boolean veririfar_double(String cadena){//alamacena los caractere de tipo double
        boolean access=false;
        try {
            if (cadena!=null){
                Double.parseDouble(cadena);
                access=true;  
            }

        } catch (Exception e) {
            access=false;
        }
        return access;
    }
    
    public void alert_informacion(String titulo, String mensaje){//es para notificar que esta lista la info
        Alert inf = new Alert(Alert.AlertType.INFORMATION);
        inf.setHeaderText(null);
        inf.setTitle(titulo);
        inf.setContentText(mensaje);
        inf.showAndWait();
    }
    public void alert_error(String titulo, String mensaje){//notifica qcuando haya un eerror
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setHeaderText(null);
            error.setTitle(titulo);
            error.setContentText(mensaje);
            error.showAndWait();
    }
    public void alert_warring(String titulo, String mensaje){//notifica las funciones especifica no pierdas el tiempo en decirle que haga
        Alert waring = new Alert(Alert.AlertType.WARNING);//el programa al ejecutarlo
        waring.setHeaderText(null);
        waring.setTitle(titulo);
        waring.setContentText(mensaje);
        waring.showAndWait();
    }
 
    public void closeVentana(Button boton, ActionEvent event){//se cierra la ventana de los botones en scene builder
        Stage stage = (Stage) boton.getScene().getWindow();
        stage.close();
        
    }

    
}
    

