package es.codeurjc.hellowordvscode;

public class Substation {
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
