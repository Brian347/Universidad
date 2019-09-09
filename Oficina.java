package Universidad;

import java.util.ArrayList;

public class Oficina {
    private int ID;
    private Trabajador trabajador;

    public Oficina(int ID, Trabajador trabajador) {
        this.ID = ID;
        this.trabajador = trabajador;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public String toString() {
        return "Oficina{" + "ID=" + ID + ", trabajador=" + trabajador + '}';
    }
    
}
    class metodoOficina{
        private ArrayList <Oficina> ofi;

        metodoOficina(){
         ofi = new ArrayList<>();   
        }
        //---------------Metodos Basicos-----------//
        public void Agregar(Oficina x){
       ofi.add(x);
        }
       public void Eliminar(Oficina x){
           ofi.remove(x);
        }
       public Oficina    Obtener(int pos){
           return ofi.get(pos);
        }
       public int Cantidad(){
           return ofi.size();
       }



}

