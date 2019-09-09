package Universidad;

public class Persona {
    protected String Nombre;
    protected String DNI;

    public Persona(String Nombre, String DNI) {
        this.Nombre = Nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
}
