/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles_vista_fx;

import comisionesimple.Impleta;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class Modificacion_de_datosController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
     @FXML
    private TextField texfield_indice;
    @FXML
    private TextField textfield_nombre;
    @FXML
    private Button button_modificar;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void _Actualizar(ActionEvent event) {//se hace la actualizacion de datos
        Controlador controlador = new Controlador();
        Impleta v = new Impleta();
        if (texfield_indice.getText().matches("-?\\d+")&&textfield_nombre.getText()!=null){
           
        int id=Integer.parseInt(texfield_indice.getText());
        
        v.actualizar(indice, textfield_nombre.getText());
        cadena_vacia();

        controlador.alert_informacion("Actualizacion", "Se ha realizado la actualizacion de datos");// da un aviso que se ha hecho la act correto
        controlador.closeVentana(button_modificar, event);
        
        }
        else{
            controlador.alert_error("Error", "revise los errores ");//hay un error con la actualizacion

        }

    }
    
}
