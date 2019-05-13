/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Conductor extends Persona{
    
    private Vehiculo coche;
    private ArrayList<Pasajero> vPasajeros;

    public Conductor(Vehiculo coche, ArrayList<Pasajero> vPasajeros, String nombre, boolean carnet) {
        super(nombre, carnet);
        this.coche = coche;
        this.vPasajeros = vPasajeros;
    }
    
    
    
}
