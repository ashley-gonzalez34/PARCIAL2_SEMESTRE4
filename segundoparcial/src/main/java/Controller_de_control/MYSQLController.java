/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles_vista_fx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author usuario
 */

public class MYSQLController implements Initializable {//este metodo donde se hace el crud
    private static final login Inicio MORE_WINDOW = new login Inicio(); 
    
    @FXML
    private Button button_registrar;
   
    @FXML
    private Button button_actualizar;
    @FXML
    private Button button_eliminar;

   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    private void insertar(ActionEvent event) throws IOException {//se inserta la inf en la base de datos
        MORE_WINDOW.ventanaInicial("/com.Vista/registar_datos.fxml","Registrar");//se registran
    }

    @FXML
    private void Actualizar(ActionEvent event) throws IOException {
        MORE_WINDOW.ventanaInicial("/com.Vista/Actualizar_datos.fxml","actualizar");// se hace la actualizacion de la info que se ingreso
    }

    @FXML
    private void Eliminar(ActionEvent event) throws IOException {
        MORE_WINDOW.ventanaInicial("/com.Vista/Eliminar_datos.fxml","eliminar");//se elimina el dato que se desea en la base de datos
    }
   }
    
    

