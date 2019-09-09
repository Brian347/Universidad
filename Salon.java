/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roman;

/**
 *
 * @author PC
 */
public class Salon {
    private int id;
    private int aforo;

    public Salon(int id, int aforo) {
        this.id = id;
        this.aforo = aforo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    @Override
    public String toString() {
        return "Salon{" + "id=" + id + ", aforo=" + aforo + '}';
    }
    
    
}
