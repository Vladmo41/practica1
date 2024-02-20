package es.codeurjc.hellowordvscode;

public class Aerogenerator {
    private String iD;
    private double latitude;
    private double longitude;
    private int length;
    private int height;
    private double power;
    public Aerogenerator(String iD,double latitude,double longitude,int length,int height,double power){

        this.iD=iD;
        this.latitude=latitude;
        this.longitude=longitude;
        this.length=length;
        this.height=height;
        this.power=power;

        
    }

    public String getID(){
        return iD;
    }
    public void setID(String n){
        iD=n;
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
