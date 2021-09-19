/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles_vista_fx;

import comisionesimple.Impleta;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class LoginInicioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML//los nombres de los botones
    private TextField textfield_nombre;
    @FXML
    private Button button_iniciar;
    private TextField texfield_contraseña;
    
    private int permiso=0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    //mando la informacion a pantalla para poder ejecutarse en el interfaz
        

     @FXML
    private void InicioSecion(ActionEvent event) throws IOException {//donde permite hacer un inicio de sesion
        permiso++;
        Impleta vendedor = new Impleta();
        Controlador controlador = new Controlador();
        if(permiso < 3){
                      

            if(vendedor.buscar_Usuario(textfield_nombre.getText(), texfield_contraseña.getText())){//se buca el nombre
                Inicio invocar = new Inicio();
                invocar.ventanaInicial("/com.Vista/MYSQL.fxml","mysql");//lo muestra en la ventaba de login
                controlador.closeVentana(button_iniciar, event);
               
        }
            else {

                controlador.alert_error("Error", "No se encuentra ese usuario ");//da un aviso que no esta ese usuario
            }

        }
        else{
            controlador.alert_error("Error", "has intentado varias veces.");//da un aviso que ya no puede colocar mas el usuario depsues de varias veces
            controlador.closeVentana(button_iniciar, event);
        }

        
        
        
    }
    
}
