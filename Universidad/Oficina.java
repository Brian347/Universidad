package Universidad;

import java.util.ArrayList;

public class Oficina {
    private int ID;
    private ArrayList<Trabajador> trabajador;

    public Oficina(int ID, ArrayList<Trabajador> trabajador) {
        this.ID = ID;
        this.trabajador = trabajador;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Trabajador> getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(ArrayList<Trabajador> trabajador) {
        this.trabajador = trabajador;
    }
    
}

class MetodosOficina {
    private ArrayList<Oficina> ofi;
    
    public MetodosOficina(){
        ofi = new ArrayList<>();
    }
    
    //Metodos Basicos
    public void Agregar(Oficina x){
        ofi.add(x);
    }
    public void Eliminar(Oficina x){
        ofi.remove(x);
    }
    public Oficina Obtener(int pos){
        return ofi.get(pos);
    }
    public int Cantidad(){
        return ofi.size();
    }
    
    
}