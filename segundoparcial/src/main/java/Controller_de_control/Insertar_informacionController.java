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
public class Insertar_informacionController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML//los nombres de los botones para dar su funcion para que la interfaz funcione
    private TextField textfield_nombre;
  
    @FXML
    private TextField textfield_ener;
    @FXML
    private TextField textfield_febr;
    @FXML
    private TextField textfield_mar;
   @FXML
    private Button button_guardatos;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

@FXML
    private void Insertar(ActionEvent event) {//se inserta el dato nuevo a la tabla
        Controlador controlador = new Controlador();
        Impleta ve = new Impleta();
        if(controlador.verificar_String(textfield_mar.getText())&&
                controlador.veririfar_double(textfield_ener.getText())&& 
                controlador.veririfar_double(textfield_febr.getText())&&
                controlador.veririfar_double(textfield_mar.getText())){
            
            double enero=Double.parseDouble(textfield_ener.getText());
            double febrero=Double.parseDouble(textfield_febr.getText());
            double marzo=Double.parseDouble(textfield_mar.getText());
            ve.registrar(textfield_nombre.getText(), ener, febr, marz);
            limpiar();
            controlador.alert_informacion("Informacion de datos", "esta correctamente los datos en la base ");
            controlador.closeVentana(button_guardatos, event);//da un aviso que se han registrado correctamente 
            
        }
        else{
            controlador.alert_error("Error"//da un aviso que hubo un error
                    + "\nNombre"//hubo un error en el nombre o en los meeses
                    + "\nLos meses");
        }
        

    }
    private void limpiar(){
        textfield_nombre.setText("");//lo que hace es limpiar en los textfiel para poder alamacenar mas datos
        textfield_febr.setText("");
        textfield_ener.setText("");
        textfield_mar.setText("");
    }
        
    
}
