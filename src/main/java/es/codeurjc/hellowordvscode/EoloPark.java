package es.codeurjc.hellowordvscode;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class EoloPark {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name ;
    private String city;
    private double latitude;
    private double longitude;
    private String terrain;
    private int area;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Substation substation;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Aerogenerator>generatorList = new ArrayList<>();

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
    public List<Aerogenerator> getGeneratorList() {
        return generatorList;
    }
    public Substation getSubstation(){
        return substation;
    }
    public void setSubstation(Substation s){
        this.substation=s;
    }
}
