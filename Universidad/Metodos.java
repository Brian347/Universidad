package Universidad;

import java.util.ArrayList;

public class Metodos {
    private Universidad uni;
    private MetodosFacultad metFacultad;
    private MetodosOficina metOficina;
    private Salon salon;
    private Trabajador trabajador;
    private Docente docente;
    
    //----------------------------METODOS BASICOS-----------------------------
    //----------METODOS AGREGAR-----------
    public void AgregarOficina(){
        int ID = 0;
        ArrayList<Trabajador> trabajador = null;
        Oficina x = new Oficina(ID,trabajador);
        metOficina.Agregar(x);
    }
    public void AgregarFacultad(){
        String nombre = "";
        ArrayList<Docente> docente = null;
        ArrayList<Oficina> oficina = null;
        ArrayList<Salon> salon = null;
        Facultad x = new Facultad(nombre, docente, oficina, salon);
        metFacultad.Agregar(x);
    }
    //----------METODOS ELIMINAR-----------
    
    //----------METODOS OBTENER-----------
   
    
}
