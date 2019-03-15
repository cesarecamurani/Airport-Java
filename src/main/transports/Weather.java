package transports;

import java.util.Random;

public class Weather {

    String[] conditions = { "Stormy", "Sunny", "Sunny" };
    String currentWeather;

    public Weather(String currentWeather){
        this.currentWeather = currentWeather;
    }

    String getWeatherConditions(Random rand){
        currentWeather = conditions[rand.nextInt(conditions.length)];
        return currentWeather;
    }
}





