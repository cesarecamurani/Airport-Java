package transports;

import java.util.Random;

public class Weather {

    String[] conditions = { "Stormy", "Sunny", "Sunny" };
    String currentWeather;
    Random rand = new Random();

    public Weather(String currentWeather){
        this.currentWeather = currentWeather;
    }

    String getWeatherConditions(){
        currentWeather = conditions[rand.nextInt(conditions.length)];
        return currentWeather;
    }
}





