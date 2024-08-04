package design_pattern.Behavioral.Observer;

public class CurrentDisplay implements Observer {
    private int temp;
    private int humidity;
    private Subject WeatherStation;
    public CurrentDisplay(Subject WeatherStation) {
        this.WeatherStation = WeatherStation;
        this.WeatherStation.register(this);
    }

    @Override
    public void update(int temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display_current_status();
    }

    public void display_current_status(){
        System.out.println("Temperature is " + this.temp);
        System.out.println("Humidity is " + this.humidity);
    }
}
