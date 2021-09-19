/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segundoparcial;

import Comisionesmod.Comisiones;
import static conexionMysql.conexion.conectar;
//import static conexionMysql.conexion2.conectar;
import controldeactualizar.eliminar.control;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class principal {//este es codigo principal
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //conectar();//conexion de mysql  hace el llamado para hacer la conexon 
                  //y poder aportar los datos que estan registrados 
        
         control controller = new control();
        Comisiones comision = null;
        int id;
        String nombre = null;//estas son las variables
        double enero = 0.0;
        double febrero = 0.0;

        double marzo = 0.0;

        double promedio = 0.0;

        double total = 0.0;
        boolean salir = false;
        String opcion = "";

        while (!salir) {
            try {
                System.out.println("Elige opcion:\n"//este es el menu
                        + "1.- INGRESE LOS DATOS\n"
                        + "2.- VER LISTA\n"
                        + "3.- MODIFICAR\n"
                        + "4.- ELIMINAR DATOS \n"
                        + "0.- SALIR DE MENU");

                opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":

                        System.out.println("Ingrese datos :");//aca pide se que ingrese los datos

                        System.out.println("Ingrese nombre: ");//ingresar el nombre
                        nombre = scanner.nextLine();
                        System.out.println("Ingrese  enero");
                        enero = scanner.nextDouble();
                        System.out.println("Ingrese  febrero");
                        febrero = scanner.nextDouble();
                        System.out.println("Ingrese  marzo");
                        marzo = scanner.nextDouble();

                        comision = new Comisiones(nombre, enero, febrero, marzo);

                        controller.registrar(comision);

                        break;
                    case "2"://este case alamacena los datos en vista

                        comision = new Comisiones();

                        controller.verComisiones();

                        break;
                    case "3":
                        comision = new Comisiones();//case ess donde se van a ir alamacenando datos del menu a dar la opcion dos

                        System.out.println("Ingrese el nuevo dato:");
                        System.out.println("Ingrese nombre ");
                        nombre = scanner.nextLine();
                        System.out.println("Ingrese indice");
                        id = scanner.nextInt();
                        System.out.println("Ingrese cantidad de enero");
                        enero = scanner.nextDouble();
                        System.out.println("Ingrese cantidad de febrero");
                        febrero = scanner.nextDouble();
                        System.out.println("Ingrese cantidad de marzo");
                        marzo = scanner.nextDouble();

                        comision.setId(id);
                        comision.setNombre(nombre);
                        comision.setEnero(enero);
                        comision.setFebrero(febrero);
                        comision.setMarzo(marzo);
                        comision.setPromedio((enero + febrero + marzo) / 3);
                        comision.setTotal(enero + febrero + marzo);
                        controller.actualizar(comision);
                        break;
                    case "4":
                        comision = new Comisiones();//es donde pide colocar id que se desea eliminar
                        System.out.println("Ingrese el indice del dato que desea eliminar:");
                        id = scanner.nextInt();
                        comision.setId(id);
                        controller.eliminar(comision);
                        break;
                    case "0":
                        System.out.println("adios!");
                        break;
                    default:
                        System.out.println("ERROR!");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

    

