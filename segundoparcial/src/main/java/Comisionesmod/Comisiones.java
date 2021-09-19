/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comisionesmod;

/**
 *
 * @author usuario
 */
public class Comisiones {
    int id;
    String nombre;
    double enero;
    double febrero;
    double marzo;
    double promedio;
    double total;

    public Comisiones( String nombre, double enero, double febrero, double marzo) {
        this.id = id;
        this.nombre = nombre;
        this.enero = enero;
        this.febrero = febrero;
        this.marzo = marzo;
        this.promedio = (this.enero + this.febrero + this.marzo) / 3;
        this.total = (this.enero + this.febrero + this.marzo);
    }

    public Comisiones() {
    }
    
    
    public int getId() {// controlo el accesso de esta variable leendo su funcion
        return id;
    }

    public void setId(int id) {//es un metodo de forma publica donde se encarga que funcione las variables
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEnero() {
        return enero;
    }

    public void setEnero(double enero) {
        this.enero = enero;
    }

    public double getFebrero() {
        return febrero;
    }

    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    public double getMarzo() {
        return marzo;
    }

    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    @Override
    public String toString() {//retorna para ejecutar la sentrncias de ...

        return this.nombre + " | " + String.valueOf(this.enero) + " | " + String.valueOf(this.febrero) + " | " + String.valueOf(this.marzo) + " | " + String.valueOf(this.promedio) + " | " + String.valueOf(this.total);
    }
}

    

