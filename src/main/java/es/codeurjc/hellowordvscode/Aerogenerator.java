package es.codeurjc.hellowordvscode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aerogenerator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String iD2;
    private double latitude;
    private double longitude;
    private int length;
    private int height;
    private double power;
    public Aerogenerator(String iD2,double latitude,double longitude,int length,int height,double power){

        this.iD2=iD2;
        this.latitude=latitude;
        this.longitude=longitude;
        this.length=length;
        this.height=height;
        this.power=power;

        
    }
    public Aerogenerator() {
        
    }

    public String getID2(){
        return iD2;
    }
    public void setID2(String n){
        iD2=n;
    }
    public double getlatitude(){
        return latitude;
    }
    public void setlatitude(double n){
        latitude=n;
    }
    public double getLongitude(){
        return longitude;
    }
    public void setLongitude(double n){
        longitude=n;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int n){
        length=n;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int n){
        height=n;
    }
    public double getPower(){
        return power;
    }
    public void setPower(double n){
        power=n;
    }
}
