package es.codeurjc.hellowordvscode;

public class EoloPark {
    
    private String name ;
    private String city;
    private String latitude;
    private String longitude;
    private String terrain;
    private int area;

    public EoloPark(String name, String city, String latitude, String longitude, int area, String terrain){
        this.name=name;
        this.city=city;
        this.latitude=latitude;
        this.longitude=longitude;
        this.area=area;
        this.terrain=terrain;
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
    public String getLatitude(){
        return latitude;
    }
    public void setLatitude(String c){
        latitude=c;
    }
    public String getLongitude(){
        return longitude;
    }
    public void setLongitude(String n){
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
}
