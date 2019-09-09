package Universidad;

public class Docente {
    private String tipo;
    private int ID;

    public Docente(String tipo, int ID) {
        this.tipo = tipo;
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
