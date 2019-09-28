package Universidad;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Facultad> facultad;
    private ArrayList<Oficina> oficina;

    public Universidad(String nombre, ArrayList<Facultad> facultad, ArrayList<Oficina> oficina) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.oficina = oficina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Facultad> getFacultad() {
        return facultad;
    }

    public void setFacultad(ArrayList<Facultad> facultad) {
        this.facultad = facultad;
    }

    public ArrayList<Oficina> getOficina() {
        return oficina;
    }

    public void setOficina(ArrayList<Oficina> oficina) {
        this.oficina = oficina;
    }

}
class MetodosUniversidad {
    ArrayList<Universidad> uni ;
    
    //Constructor
    public MetodosUniversidad(){
        uni = new ArrayList<Universidad>();
    }
    
    //Metodos Basicos
    public void Agregar(Universidad x){
        uni.add(x);
    }
    public void Eliminar(Universidad x){
        uni.remove(x);
    }
    public Universidad Obtener(int pos){
        return uni.get(pos);
    }
    public int Cantidad(){
        return uni.size();
    }
}