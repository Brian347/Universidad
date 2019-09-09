/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anca;

/**
 *
 * @author BRIAN
 */
public class Trabajador extends Persona{
    String tipoTrabajador;
    int ID;
    
    public Trabajador(String tipoTrabajador, int DNI, String nombre, String dni){
        super(nombre, dni);
        this.tipoTrabajador=tipoTrabajador;
        this.ID=ID;
    }
}
