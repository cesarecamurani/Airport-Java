package transports;

import java.util.Random;

public class Weather {

    public Weather(){}

    String[] conditions = { "Stormy", "Sunny", "Sunny" };
    Random rand = new Random();

    String getWeatherConditions(){
        return conditions[rand.nextInt(conditions.length)];
    }
}





