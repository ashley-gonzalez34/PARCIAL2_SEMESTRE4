/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldeactualizar.eliminar;

import Comisionesmod.Comisiones;
import Interface.InterComisi;
import VerComisi.vercomsio;
import comisionesimple.Impleta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class control {
    

    private vercomsio vista = new vercomsio();

    public control() {
    }

    //es para guardar un cliente
    public void registrar(Comisiones comision) {
        InterComisi dao = new Impleta();
        dao.registrar(comision);
    }

    //hace el llamado para actualizar un cliente
    public void actualizar(Comisiones cliente) {
        InterComisi dao = new Impleta();
        dao.actualizar(cliente);
    }

    // para eliminar un cliente
    public void eliminar(Comisiones comision) {
        InterComisi dao = new Impleta();
        dao.eliminar(comision);
    }

    //es para obtener todos los clientes y luego los muestra en la vista
    public void verComisiones() {
        List<Comisiones> comision = new ArrayList<Comisiones>();
        InterComisi dao = new Impleta();
        comision = dao.obtener();
        System.out.println("Nombre \t|| Enero \t|| Febrero \t|| Marzo \t|| Promedio \t|| Total");
        vista.verComisiones(comision);
    }

}

    

