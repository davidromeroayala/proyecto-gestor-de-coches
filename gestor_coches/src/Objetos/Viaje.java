/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author david
 */
public class Viaje {
    private String nombre;
    private String lugar;
    private Date inicio;
    private Date vuelta;
    private ArrayList<Conductor> vConductor;

    public Viaje(String nombre, String lugar, Date inicio, Date vuelta, ArrayList<Conductor> vConductor) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.inicio = inicio;
        this.vuelta = vuelta;
        this.vConductor = vConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getVuelta() {
        return vuelta;
    }

    public void setVuelta(Date vuelta) {
        this.vuelta = vuelta;
    }

    public ArrayList<Conductor> getvConductor() {
        return vConductor;
    }

    public void setvConductor(ArrayList<Conductor> vConductor) {
        this.vConductor = vConductor;
    }
    
    
    
}
