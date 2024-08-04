package design_pattern.Behavioral.Observer;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer design pattern");
        // create a new WeatherStation
        WeatherStation weatherstation = new WeatherStation();

        // create observers
        CurrentDisplay curr = new CurrentDisplay(weatherstation);
        ForeCastingDisplay fs = new ForeCastingDisplay(weatherstation);

        for(int i=0; i<4; i++) {
            int Randtemp = getRandomNumber(-10, 50);
            int RandHum = getRandomNumber(20, 50);

            weatherstation.parametersChanged(Randtemp, RandHum);
        }
    }

    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max + 1 - min) + min;
    }
}
