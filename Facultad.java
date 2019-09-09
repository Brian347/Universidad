package Universidad;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private Docente docente;
    private Oficina oficina;
    private Salon salon;

    public Facultad(String nombre, Docente docente, Oficina oficina, Salon salon) {
        this.nombre = nombre;
        this.docente = docente;
        this.oficina = oficina;
        this.salon = salon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Docente> getDocente() {
        return docente;
    }

    public void setDocente(ArrayList<Docente> docente) {
        this.docente = docente;
    }

    public ArrayList<Oficina> getOficina() {
        return oficina;
    }

    public void setOficina(ArrayList<Oficina> oficina) {
        this.oficina = oficina;
    }

    public ArrayList<Salon> getSalon() {
        return salon;
    }

    public void setSalon(ArrayList<Salon> salon) {
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Facultad{" + "nombre=" + nombre + ", docente=" + docente + ", oficina=" + oficina + ", salon=" + salon + '}';
    }
    
    
}
class metodoFacultad{
    private ArrayList<Facultad> facu;
    metodoFacultad(){
            facu = new ArrayList<>();   
        }
   //--------Metodo basicos------------//
    public void Agregar(Facultad x){
       facu.add(x);
    }
   public void Eliminar(Facultad x){
       facu.remove(x);
    }
   public Facultad Obtener(int pos){
       return facu.get(pos);
    }
   public int Cantidad(){
       return facu.size();
   }
       
}
