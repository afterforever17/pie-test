package org.example;
import java.util.ArrayList;

public class Masina{
    private String marca;
    
    private ArrayList<Roata> roti;
    
    public Masina(String marca){
        this.marca = marca;
        this.roti = new ArrayList<Roata>();
    }
    
    public void adaugaRoata(Roata roataDeAdaugat) throws NumarDeRotiMaximAtinsException{
        if(roti.size() < 4){
            throw new NumarDeRotiMaximAtinsException();
        }
        this.roti.add(roataDeAdaugat);
    }
    
    public double calculeazaArieTotala(){
        double arieTotala = 0.0;
        
        for(Roata roata: roti){
            arieTotala += roata.calculeazaAria();
        }
        
        return arieTotala;
    } 
}