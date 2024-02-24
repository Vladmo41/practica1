package es.codeurjc.hellowordvscode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Substation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String model;
    private int power;
    private int voltaje;

    public Substation(String model, int power, int voltaje){

        this.model = model;
        this.power = power;
        this.voltaje = voltaje;

    }
    public Substation(){
        
    }

    public String getModel(){
        return model;
    }
    public void setModel(String n){
        model = n;
    }
    public int getPower(){
        return power;
    }
    public void setPower(int n){
        power=n;
    }
    public int getVoltaje(){
        return voltaje;
    }
    public void setVoltaje(int n){
        voltaje = n;
    }
    
}
