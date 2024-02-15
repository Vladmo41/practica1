package es.codeurjc.hellowordvscode;

public class Aerogenerator {
    private String ID;
    private double latitude;
    private double longitude;
    private int length;
    private int height;
    private double power;
    public Aerogenerator(String ID,double latitude,double longitude,int length,int height,double power){

        this.ID=ID;
        this.latitude=latitude;
        this.longitude=longitude;
        this.length=length;
        this.height=height;
        this.power=power;
    }

}
