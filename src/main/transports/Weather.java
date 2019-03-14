package transports;

import java.util.Random;

public class Weather {

    public Weather(){}

    private String[] conditions = new String[]{ "Stormy", "Sunny", "Sunny" };
    private Random rand = new Random();

    public String getWeatherConditions(){
        return conditions[rand.nextInt(conditions.length)];
    }


}





