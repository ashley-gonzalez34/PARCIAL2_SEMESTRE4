/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Comisionesmod.Comisiones;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface InterComisi {//esta interface donde  alamacenan los datos de registrar,actualiza datos y elimina
    

    public boolean registrar(Comisiones comision);

    public List<Comisiones> obtener();

    public boolean actualizar(Comisiones comision);

    public boolean eliminar(Comisiones comision);
}
