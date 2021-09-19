/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerComisi;

import Comisionesmod.Comisiones;
import java.util.List;

/**
 *
 * @author usuario
 */
public class vercomsio {//este metoodo es de vista
    

    public void verComision(Comisiones comision) {
        System.out.println(comision);
    }

    public void verComisiones(List<Comisiones> comisiones) {
        for (Comisiones comision : comisiones) {
            System.out.println(comision);
        }
    }
    
}
