package es.codeurjc.hellowordvscode;

import java.util.ArrayList;

public class EoloPark {
    
    private String name ;
    private String city;
    private double latitude;
    private double longitude;
    private String terrain;
    private int area;
    private Substation substation;
    private ArrayList<Aerogenerator> generatorList;

    public EoloPark(String name, String city, double latitude, double longitude, int area, String terrain,Substation substation, ArrayList<Aerogenerator> generatorList){
        this.name=name;
        this.city=city;
        this.latitude=latitude;
        this.longitude=longitude;
        this.area=area;
        this.terrain=terrain;
        this.substation = substation;
        this.generatorList = generatorList != null ? generatorList : new ArrayList<>();
    }
    public EoloPark() {
        
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String c){
        city=c;
    }
    public double getLatitude(){
        return latitude;
    }
    public void setLatitude(double c){
        latitude=c;
    }
    public double getLongitude(){
        return longitude;
    }
    public void setLongitude(double n){
        longitude=n;
    }
    public int getArea(){
        return area;
    }
    public void setArea(int a){
        area=a;
    }
    public String getterrain(){
        return terrain;
    }
    public void setTerrain(String a){
        terrain=a;
    }
    public ArrayList<Aerogenerator> getGeneratorList() {
        return generatorList;
    }
    public Substation getSubstation(){
        return substation;
    }
    public void setSubstation(Substation s){
        this.substation=s;
    }
}
