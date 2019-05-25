/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author david
 */
public class Vehiculo {
  private String matricula;
  private String marca;
  private String modelo;
  private int plazas;

 public Vehiculo(String matricula, String marca, String modelo, int plazas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.plazas = plazas;
    }  

 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

}
