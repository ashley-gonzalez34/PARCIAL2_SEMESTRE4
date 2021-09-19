/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_de_control;

import Comisionesmod.Comisiones;
import comisionesimple.Impleta;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
//import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class ELIMINACIONDEDATOSController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField textfield_indice;//esto son los nombre de los botones 
    @FXML
    private Button button_eliminardato;

    //@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML//lo que  hace es ir eliminando los datos 
    private void Eliminar(ActionEvent event) {
         Controlador = new Controlador();
        if(textfield_indice.getText().matches("-?\\d+")){
            
            Alert confirmacion = new Alert(Alert.AlertType.CONFIRMATION);//confirma qe se han eliminando
            confirmacion.setHeaderText(null);
            confirmacion.setTitle("confirme");
            confirmacion.setContentText("¿Desea eliminar este dato?");//da un aviso
            Optional<ButtonType> opcion= confirmacion.showAndWait();
            if(opcion.get()==ButtonType.OK){

                Impleta vendedor = new Impleta();
                int id = Integer.parseInt(textfield_indice.getText());
                vendedor.eliminar(dato);
                textfield_indice.setText("");
                Controlador.alert_informacion("Informacion", "¡Se ha eliminado!");//notifica del controlador que ya no existe el dato
                controlador.closeVentana(button_eliminardato, event);
            }
            
            else{
                controlador.alert_informacion("Informacion", "Se ha  cancelado ");//notifica que se ha cancelado lo que se iba a eliminar
                controlador.closeVentana(button_eliminardato, event);
                textfield_indice.setText("");
            }   

        }
        else {
            controlador.alert_error("Error");//da un aviso que hay un error

        }

    }
    
}
