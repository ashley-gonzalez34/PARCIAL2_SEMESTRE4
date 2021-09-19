/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisionesimple;

import Comisionesmod.Comisiones;
import Interface.InterComisi;
import conexionMysql.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Impleta implements InterComisi {//este es la implemetacion

    @Override
    public boolean registrar(Comisiones dato3) {//este metodo se registran los datos en mysql
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO tb_alumnos values (NULL,'" + dato3.getNombre() + "','" + dato3.getEnero() + "','" + dato3.getFebrero() + "','" + dato3.getMarzo() + "','" + dato3.getPromedio() + "','" + dato3.getTotal() + "')";

        try {
            con = conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Comisiones> obtener() {

        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM tb_alumnos ORDER BY ID";// se seleccionan los datos y la clausula las ordena

        List<Comisiones> listaComision = new ArrayList<Comisiones>();

        try {
            co = conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Comisiones dato1 = new Comisiones();
            
                dato1.setNombre(rs.getString(1));
                dato1.setEnero(rs.getDouble(2));
                dato1.setFebrero(rs.getDouble(3));
                dato1.setMarzo(rs.getDouble(4));
               

                listaComision.add(dato1);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        return listaComision;
    }

    @Override
    public boolean actualizar(Comisiones dato) {//este metodo es donde se van actualizando los datos
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE tb_alumnos SET nombre='" + dato.getNombre() + "', enero='" + dato.getEnero() + "', febrero='" + dato.getFebrero() + "', marzo='" + dato.getMarzo() + "', promedio='" + dato.getPromedio() + "', total='" + dato.getTotal() + "'" + " WHERE ID=" + dato.getId();
        try {
            connect = conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminar(Comisiones dato2) {//seeliminan los datos en la base
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM tb_alumnos WHERE ID=" + dato2.getId();//
        try {
            connect = conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return eliminar;
    }
}

    

