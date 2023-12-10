package ensim.info.TP3_Java.controller;

import ensim.info.TP3_Java.model.EtalabAPIAddress;
import ensim.info.TP3_Java.model.MeteoConceptAPIAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import ensim.info.TP3_Java.model.Feature;

@Controller
public class MeteoController {

    @Autowired
    RestTemplate rt;

    @GetMapping("/adresse")
    public String addAddress() {
        return "addAddress";
    }

    @PostMapping("/meteo")
    public String getMeteo(@RequestParam(name="address", required = true) String address, Model model) {
        String query = address.toLowerCase().replace(" ", "+");
        EtalabAPIAddress response = rt.getForObject("https://api-adresse.data.gouv.fr/search/?q=" + query + "&limit=1", EtalabAPIAddress.class);

        Feature feature = response.features.get(0);
        float longitude = feature.getGeometry().getCoordinates().get(0);
        float latitude = feature.getGeometry().getCoordinates().get(1);
        model.addAttribute("longitude", longitude);
        model.addAttribute("latitude", latitude);

        // "apiMeteoProjetEnsim";
        String token = "3dddb677ae1b277e2b9185b3b57c7a191d5495495584340cb6cca2473817bd9d";

        query = "https://api.meteo-concept.com/api/forecast/nextHours?token=" + token + "&latlng=" + latitude + "," + longitude;

        MeteoConceptAPIAddress response2 = rt.getForObject(query, MeteoConceptAPIAddress.class);

        int temp2m = response2.forecast.get(0).getTemp2m();

        model.addAttribute("temp2m", temp2m);
        return "meteo";
    }
}
