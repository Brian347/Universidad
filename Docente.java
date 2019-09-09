/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad;

/**
 *
 * @author BRIAN
 */
public class Docente extends Persona {
   String tipoDocente;
   int ID;
   
   public Docente(String tipoDocente, int ID, String nombre, String dni){
       super(nombre, dni);
       this.tipoDocente=tipoDocente;
       this.ID=ID;
   }
}
