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
public abstract class Persona {
   protected String nombre;
   protected boolean carnet;
   protected ArrayList<Objetos> vObjetos;

    public Persona() {
    }

    public Persona(String nombre, boolean carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
       
    }
   
   
}
