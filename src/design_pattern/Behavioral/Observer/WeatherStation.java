package design_pattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private int temp;
    private int humidity;
    private List<Observer> observers;
    public WeatherStation(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer O) {
        this.observers.add(O);
    }

    @Override
    public void remove(Observer O) {
        int observerIdx = this.observers.indexOf(O);
        if(observerIdx >= 0) {
            this.observers.remove(observerIdx);
        }
    }

    public void parametersChanged(int temp, int humidity){
        this.temp = temp;
        this.humidity = humidity;
        notify_all();
    }

    @Override
    public void notify_all() {
        this.observers.forEach(O -> O.update(this.temp, this.humidity));
    }
}
