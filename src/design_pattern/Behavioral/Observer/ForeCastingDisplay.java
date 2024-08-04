package design_pattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class ForeCastingDisplay implements Observer{
    private List<Integer> temp;
    private List<Integer> humidity;
    private Subject WeatherStation;
    public ForeCastingDisplay(Subject WeatherStation){
        this.temp = new ArrayList<>();
        this.humidity = new ArrayList<>();
        this.WeatherStation = WeatherStation;
        this.WeatherStation.register(this);
    }
    @Override
    public void update(int temp, int humidity) {
        this.temp.add(temp);
        this.humidity.add(humidity);
        display_current_status();
    }

    public void display_current_status() {
        System.out.println("Temperature of Last 7 days is " + this.temp.subList(Math.max(this.temp.size() - 7, 0), this.temp.size()));
        System.out.println("Humidity of Last 7 days is " + this.humidity.subList(Math.max(this.humidity.size() - 7, 0), this.humidity.size()));

    }
}
