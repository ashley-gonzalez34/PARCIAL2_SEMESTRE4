/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles_vista_fx;

import comisionesimple.Impleta;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class TABLADEDATOSController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private TableView<ClassVendedor> table;
    @FXML
    private TableColumn <ClassVendedor, String> table_id;
    @FXML
    private TableColumn <ClassVendedor, String> table_nombre;
    @FXML
    private TableColumn <ClassVendedor, String> table_enero;
    @FXML
    private TableColumn <ClassVendedor, String> table_febrero;
    @FXML
    private TableColumn <ClassVendedor, String> table_marzo;
    @FXML
    private TableColumn <ClassVendedor, String> table_promedio;
    @FXML
    private TableColumn <ClassVendedor, String> table_total;
    
    private ObservableList <ClassVendedor> vendedor;
    
    
    public void listar(){//se va haciendo la lista
                Impleta vendedorDB = new Impleta();
                List <ClassVendedor> vendedores = vendedorDB.seleccion();
                tabla();             
                for (ClassVendedor vnd: vendedores){
                    table.getItems().addAll(vnd);
                }
        
    }
    private TableView tabla(){//este meto es dondese permite ir registrando los dtos a la tabla 
       table_id.setCellValueFactory(new PropertyValueFactory<ClassVendedor, String>("id"));
       table_nombre.setCellValueFactory(new PropertyValueFactory<ClassVendedor, String>("nombre"));
       table_enero.setCellValueFactory(new PropertyValueFactory<ClassVendedor, String>("enero"));
       table_febrero.setCellValueFactory(new PropertyValueFactory<ClassVendedor, String>("febrero"));
       table_marzo.setCellValueFactory(new PropertyValueFactory<ClassVendedor, String>("marzo"));
       table_promedio.setCellValueFactory(new PropertyValueFactory<ClassVendedor, String>("promedio"));
       table_total.setCellValueFactory(new PropertyValueFactory<ClassVendedor, String>("Total")); 
      
       return table;
    }
}

    

