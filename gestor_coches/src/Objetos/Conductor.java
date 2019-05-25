/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author david romero ayala 
 */
public class Conductor extends Persona {

    private Vehiculo coche;
    private ArrayList<Persona> vPersona;

    public Conductor() {
        super(null, null, null, false, null);
    }

 public Conductor(String dni, String nombre, String apellido, boolean vehiculo, String telefono) {
        super(dni, nombre, apellido, vehiculo, telefono);
        this.coche = null;
        this.vPersona = new ArrayList<>();
    }
    
    
    public Conductor(Vehiculo coche, ArrayList<Persona> vPersona, String dni, String nombre, String apellido, boolean vehiculo, String telefono) {
        super(dni, nombre, apellido, vehiculo, telefono);
        this.coche = new Vehiculo(coche.getMatricula(), coche.getMarca(), coche.getModelo(), coche.getPlazas());
        this.vPersona = vPersona;
    }

    public Vehiculo getCoche() {
        return new Vehiculo(coche.getMatricula(), coche.getMarca(), coche.getModelo(), coche.getPlazas());
    }

    public void setCoche(Vehiculo coche) {
        this.coche = new Vehiculo(coche.getMatricula(), coche.getMarca(), coche.getModelo(), coche.getPlazas());
    }

    public ArrayList<Persona> getvPersona() {
        return vPersona;
    }

    public void setvPersona(ArrayList<Persona> vPersona) {
        this.vPersona = vPersona;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
    
    public void añadir(Persona per){
       vPersona.add(per);
    }
    public String plantilla(){
       int num=1;
        String txt="";
       txt="Conductor:"+this.nombre+"/n";
        for (Persona persona : vPersona) {
            txt+="pasajero "+ persona.toString()+"/n";
            num++;
        }
        return txt;
    }
}


