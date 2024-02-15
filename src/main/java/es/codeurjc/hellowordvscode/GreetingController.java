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

public GreetingController(){
		eoloparks.add(new EoloPark("Parque 1", "Madrid", "10", "100", 1, "e"));
        eoloparks.add(new EoloPark("Parque 2", "Barcelona", "20", "200", 2, "j"));
		eoloparks.add(new EoloPark("Parque 3", "Madrid", "20", "200", 2, "j"));
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
	@GetMapping("/new_eolopark")
    public String newEoloParkForm() {
        return "new_eolopark";
    }

    @PostMapping("/create_eolopark")
    public String createEoloPark(@RequestParam String name, @RequestParam String city,@RequestParam String latitude, @RequestParam String longitude,@RequestParam int area, @RequestParam String terrain) {
        EoloPark newPark = new EoloPark(name, city, latitude, longitude, area, terrain);
        eoloparks.add(newPark);
        return "redirect:/greeting";
    }
}
