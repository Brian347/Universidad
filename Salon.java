package Universidad;

public class Salon {
    private int ID;
    private int aforo; 

    public Salon(int ID, int aforo) {
        this.ID = ID;
        this.aforo = aforo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
}
