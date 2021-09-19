/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
    
 * @author usuario
 */public class conexion {
     
     

    
   public static Connection conectar() {
        Connection con = null;

        String user = "root";//usuario
        String password = "123456";//contraseña
        
        String url = "jdbc:mysql://localhost:3306/bd_parcial2?user=" + user //el url para poner conctar
                + "&password=" + password;
        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("esta Conectado");
            }
       } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
       }
        return con;
   }
    }
