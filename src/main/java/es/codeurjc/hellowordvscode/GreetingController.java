package es.codeurjc.hellowordvscode;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    private ArrayList<EoloPark> eoloparks = new ArrayList<>();
    private ArrayList<Aerogenerator> a1top1 = new ArrayList<>();
    private Substation s1 = new Substation("ab",1,2);

    public GreetingController(){

        Aerogenerator a1 = new Aerogenerator("123",1,2,3,4,5 );
        Aerogenerator a2 = new Aerogenerator("234",1,2,3,4,5);
        a1top1.add(a1);
        a1top1.add(a2);
        eoloparks.add(new EoloPark("Parque 1", "Madrid", 10, 100, 1, "e",null, a1top1));
        eoloparks.add(new EoloPark("Parque 2", "Barcelona", 20, 200, 2, "j", s1, a1top1));
        eoloparks.add(new EoloPark("Parque 3", "Madrid", 20, 200, 2, "j", null, null));
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "World");
        model.addAttribute("eoloparks", eoloparks);
        return "greting_template";
    }

    @GetMapping("/search")
    public String search(@RequestParam String city, Model model) {
        ArrayList<EoloPark> filteredParks = new ArrayList<>();
        for (EoloPark park : eoloparks) {
            if (park.getCity().equalsIgnoreCase(city)) {
                filteredParks.add(park);
            }
        }
        model.addAttribute("eoloparks", filteredParks);
        return "greting_template";
    }
    @GetMapping("/show_eolopark")
    public String showEolopark(@RequestParam String name, Model model) {
    EoloPark eolopark = eoloparks.stream().filter(park -> park.getName().equals(name)).findFirst().orElse(null);
        
    model.addAttribute("eolopark", eolopark);

    return "show_eolopark";
}

    @GetMapping("/new_eolopark")
    public String newEoloParkForm() {
        return "new_eolopark";
    }

    @PostMapping("/create_eolopark")
public String createEoloPark(@RequestParam String name, @RequestParam String city,@RequestParam double latitude, @RequestParam double longitude,@RequestParam int area, @RequestParam String terrain,  Model model) {
    
    boolean nameExists = eoloparks.stream().anyMatch(park -> park.getName().equalsIgnoreCase(name));
    if (nameExists) {
        
        model.addAttribute("error", "El nombre del parque ya existe");
        return "new_eolopark";
    }

    
    EoloPark newPark = new EoloPark(name, city, latitude, longitude, area, terrain, null, a1top1);
    eoloparks.add(newPark);
    return "redirect:/greeting";
}
@PostMapping("/add_aerogenerator")
    public String addAerogeneratorForm(@RequestParam String parkName, Model model) {
        model.addAttribute("parkName", parkName);
        return "add_aerogenerator";
    }

    @PostMapping("/add_aerogenerator_submit")
    public String addAerogeneratorSubmit(@RequestParam String parkName, @RequestParam String aerogeneratorID, @RequestParam double aerogeneratorLatitude, @RequestParam double aerogeneratorLongitude, @RequestParam int aerogeneratorLength, @RequestParam int aerogeneratorHeight,  @RequestParam double aerogeneratorPower, Model model) {
        EoloPark parkToAddAerogenerator =null;
        for(EoloPark park:eoloparks){
            if(park.getName().equals(parkName)){
                parkToAddAerogenerator = park;
            }
        }

        if (parkToAddAerogenerator != null) {
            Aerogenerator newAerogenerator = new Aerogenerator(aerogeneratorID, aerogeneratorLatitude, aerogeneratorLongitude,aerogeneratorLength, aerogeneratorHeight, aerogeneratorPower);
            parkToAddAerogenerator.getGeneratorList().add(newAerogenerator);
        }
        return "redirect:/greeting";
    }
    

    @PostMapping("/add_substation")
    public String addSubstation(@RequestParam String parkName, Model model) {
        model.addAttribute("parkName", parkName);
        return "add_substation";
    }

    @PostMapping("/add_substation_submit")
    public String addsubstationSubmit(@RequestParam String parkName, @RequestParam String substationModel, @RequestParam int SubstationPower, @RequestParam int SubstationVoltaje, Model model) {
        
        EoloPark eolopark = eoloparks.stream()
        .filter(park -> park.getName().equals(parkName))
        .findFirst()
        .orElse(null);
        if (eolopark != null) {
            Substation substation = new Substation(substationModel, SubstationPower, SubstationVoltaje);
            eolopark.setSubstation(substation);
            
        }
        return "redirect:/greeting";
    }

    @PostMapping("/modify_eolopark")
    public String modifyEolopark(@RequestParam String parkName, Model model) {
        
        return "redirect:/greeting";
    }

    @PostMapping("/delete_eolopark")
    public String deleteEolopark(@RequestParam String parkName, Model model) {
        EoloPark parkToAddAerogenerator =null;
        for(EoloPark park:eoloparks){
            if(park.getName().equals(parkName)){
                parkToAddAerogenerator = park;
            }
        }
        eoloparks.remove(parkToAddAerogenerator);
        return "redirect:/greeting";
    }

}
