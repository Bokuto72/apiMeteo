package ensim.info.TP3_Java.model;

import java.util.List;

public class MeteoConceptAPIAddress {
    public List<Forecast> forecast;

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
}
