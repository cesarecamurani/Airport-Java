package transports;

import java.util.Random;

public class Weather {

    public Weather(){}

    String[] conditions = { "Stormy", "Sunny", "Sunny" };
    String currentWeather;
    Random rand = new Random();

    String getWeatherConditions(){
        currentWeather = conditions[rand.nextInt(conditions.length)];
        return currentWeather;
    }
}





